/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the parameters of a ScaleSet managed disk.
 */
public class VirtualMachineScaleSetManagedDiskParameters {
    /**
     * Specifies the storage account type for the managed disk. NOTE:
     * UltraSSD_LRS can only be used with data disks, it cannot be used with OS
     * Disk. Possible values include: 'Standard_LRS', 'Premium_LRS',
     * 'StandardSSD_LRS', 'UltraSSD_LRS'.
     */
    @JsonProperty(value = "storageAccountType")
    private StorageAccountTypes storageAccountType;

    /**
     * Specifies the customer managed disk encryption set resource id for the
     * managed disk.
     */
    @JsonProperty(value = "diskEncryptionSet")
    private DiskEncryptionSetParameters diskEncryptionSet;

    /**
     * Get specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk. Possible values include: 'Standard_LRS', 'Premium_LRS', 'StandardSSD_LRS', 'UltraSSD_LRS'.
     *
     * @return the storageAccountType value
     */
    public StorageAccountTypes storageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Set specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk. Possible values include: 'Standard_LRS', 'Premium_LRS', 'StandardSSD_LRS', 'UltraSSD_LRS'.
     *
     * @param storageAccountType the storageAccountType value to set
     * @return the VirtualMachineScaleSetManagedDiskParameters object itself.
     */
    public VirtualMachineScaleSetManagedDiskParameters withStorageAccountType(StorageAccountTypes storageAccountType) {
        this.storageAccountType = storageAccountType;
        return this;
    }

    /**
     * Get specifies the customer managed disk encryption set resource id for the managed disk.
     *
     * @return the diskEncryptionSet value
     */
    public DiskEncryptionSetParameters diskEncryptionSet() {
        return this.diskEncryptionSet;
    }

    /**
     * Set specifies the customer managed disk encryption set resource id for the managed disk.
     *
     * @param diskEncryptionSet the diskEncryptionSet value to set
     * @return the VirtualMachineScaleSetManagedDiskParameters object itself.
     */
    public VirtualMachineScaleSetManagedDiskParameters withDiskEncryptionSet(DiskEncryptionSetParameters diskEncryptionSet) {
        this.diskEncryptionSet = diskEncryptionSet;
        return this;
    }

}
