/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.v2.management.resources.childresource;

import com.microsoft.azure.v2.management.resources.fluentcore.arm.models.implementation.ExternalChildResourceImpl;
import io.reactivex.disposables.Disposable;
import org.junit.Assert;
import org.junit.Test;
import io.reactivex.Observer;
import io.reactivex.exceptions.CompositeException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class ExternalChildResourceTests {
    @Test
    public void noCommitIfNoChange() throws InterruptedException {
        ChickenImpl chicken = new ChickenImpl(); // Parent resource
        PulletsImpl pullets = chicken.pullets(); // Child resource collection
        final CountDownLatch monitor = new CountDownLatch(1);
        // Note that commitAsync() won't be exposed to the end-user as it's a part of child resource impl
        // pullets.commitAsync will be called from (Applicable)chicken.applyAsync() or (Creatable)chicken.createAsyncStreaming().
        //
        // Observable<Chicken> Chicken::ApplyAsync() {
        //      [1] update chicken
        //      [2] update pullets by calling pullets.commitAsync()
        // }
        //
        // In the unit test cases we call it directly as we testing external child resource here.
        //
        pullets.commitAsync()
                .subscribe(new Observer<PulletImpl>() {
                    @Override
                    public void onSubscribe(Disposable disposable) {
                    }

                    @Override
                    public void onComplete() {
                        monitor.countDown();
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        monitor.countDown();
                        Assert.fail("nothing to commit onError should not be invoked");
                    }

                    @Override
                    public void onNext(PulletImpl pullet) {
                        Assert.fail("nothing to commit onNext should not be invoked");
                    }
                });
        monitor.await();
    }

    @Test
    public void shouldCommitCreateUpdateAndDelete() throws InterruptedException {
        ChickenImpl chicken = new ChickenImpl(); // Parent resource
        chicken
            .defineNewPullet("alice")
                .withAge(1)
                .attach()
            .updatePullet("Clover")
                .withAge(2)
                .parent()
            .withoutPullet("Pinky");

        final List<PulletImpl> changedPuppets = new ArrayList<>();
        final CountDownLatch monitor = new CountDownLatch(1);

        PulletsImpl pullets = chicken.pullets();
        pullets.commitAsync().subscribe(new Observer<PulletImpl>() {

            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(PulletImpl pullet) {
                changedPuppets.add(pullet);
            }

            @Override
            public void onError(Throwable throwable) {
                monitor.countDown();
                Assert.fail("onError should not be invoked");
            }

            @Override
            public void onComplete() {
                monitor.countDown();
            }
        });

        monitor.await();
        Assert.assertEquals(2, changedPuppets.size());
        for (PulletImpl pullet : changedPuppets) {
            Assert.assertEquals(ExternalChildResourceImpl.PendingOperation.None, pullet.pendingOperation());
        }
    }

    @Test
    public void shouldEmitErrorAfterAllSuccessfulCommit() throws InterruptedException {
        ChickenImpl chicken = new ChickenImpl(); // Parent resource
        chicken
            .defineNewPullet("alice")
                .withAge(1)
                .withFailFlag(PulletImpl.FailFlag.OnCreate)
                .attach()
            .updatePullet("Clover")
                .withAge(2)
                .parent()
            .updatePullet("Goldilocks")
                .withAge(2)
                .withFailFlag(PulletImpl.FailFlag.OnUpdate)
                .parent()
            .withoutPullet("Pinky");

        final List<PulletImpl> changedPuppets = new ArrayList<>();
        final List<Throwable> throwables = new ArrayList<>();
        final CountDownLatch monitor = new CountDownLatch(1);
        PulletsImpl pullets = chicken.pullets();
        pullets.commitAsync()
                .blockingSubscribe(new Observer<PulletImpl>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onNext(PulletImpl pullet) {
                        changedPuppets.add(pullet);
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        try {
                            CompositeException exception = (CompositeException) throwable;
                            Assert.assertNotNull(exception);
                            for (Throwable innerThrowable : exception.getExceptions()) {
                                throwables.add(innerThrowable);
                            }
                        } finally {
                            monitor.countDown();
                        }
                    }

                    @Override
                    public void onComplete() {
                        monitor.countDown();
                        Assert.fail("onCompleted should not be invoked");
                    }
                });

        monitor.await();
        Assert.assertEquals(2, throwables.size());
        Assert.assertEquals(1, changedPuppets.size());
    }

    @Test
    public void canStreamAccumulatedResult() throws InterruptedException {
        ChickenImpl chicken = new ChickenImpl();
        chicken.defineNewPullet("alice")
                .withAge(1)
                .attach()
                .updatePullet("Clover")
                .withAge(2)
                .attach()
                .withoutPullet("Pinky");

        PulletsImpl pullets = chicken.pullets();
        List<PulletImpl> result = pullets.commitAndGetAllAsync().blockingGet();
        Assert.assertEquals(2, result.size());
    }
}