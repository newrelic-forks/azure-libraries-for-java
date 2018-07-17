/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.implementation;

import java.util.List;
import com.microsoft.azure.management.appservice.PrivateAccessVirtualNetwork;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.ProxyOnlyResource;

/**
 * Description of the parameters of Private Access for a Web Site.
 */
@JsonFlatten
public class PrivateAccessInner extends ProxyOnlyResource {
    /**
     * Whether private access is enabled or not.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * The Virtual Networks (and subnets) allowed to access the site privately.
     */
    @JsonProperty(value = "properties.virtualNetworks")
    private List<PrivateAccessVirtualNetwork> virtualNetworks;

    /**
     * Get whether private access is enabled or not.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set whether private access is enabled or not.
     *
     * @param enabled the enabled value to set
     * @return the PrivateAccessInner object itself.
     */
    public PrivateAccessInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the Virtual Networks (and subnets) allowed to access the site privately.
     *
     * @return the virtualNetworks value
     */
    public List<PrivateAccessVirtualNetwork> virtualNetworks() {
        return this.virtualNetworks;
    }

    /**
     * Set the Virtual Networks (and subnets) allowed to access the site privately.
     *
     * @param virtualNetworks the virtualNetworks value to set
     * @return the PrivateAccessInner object itself.
     */
    public PrivateAccessInner withVirtualNetworks(List<PrivateAccessVirtualNetwork> virtualNetworks) {
        this.virtualNetworks = virtualNetworks;
        return this;
    }

}