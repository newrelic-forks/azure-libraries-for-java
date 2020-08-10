/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Bgp Communities sent over ExpressRoute with each route corresponding to a
 * prefix in this VNET.
 */
public class VirtualNetworkBgpCommunities {
    /**
     * The BGP community associated with the virtual network.
     */
    @JsonProperty(value = "virtualNetworkCommunity", required = true)
    private String virtualNetworkCommunity;

    /**
     * The BGP community associated with the region of the virtual network.
     */
    @JsonProperty(value = "regionalCommunity", access = JsonProperty.Access.WRITE_ONLY)
    private String regionalCommunity;

    /**
     * Get the BGP community associated with the virtual network.
     *
     * @return the virtualNetworkCommunity value
     */
    public String virtualNetworkCommunity() {
        return this.virtualNetworkCommunity;
    }

    /**
     * Set the BGP community associated with the virtual network.
     *
     * @param virtualNetworkCommunity the virtualNetworkCommunity value to set
     * @return the VirtualNetworkBgpCommunities object itself.
     */
    public VirtualNetworkBgpCommunities withVirtualNetworkCommunity(String virtualNetworkCommunity) {
        this.virtualNetworkCommunity = virtualNetworkCommunity;
        return this;
    }

    /**
     * Get the BGP community associated with the region of the virtual network.
     *
     * @return the regionalCommunity value
     */
    public String regionalCommunity() {
        return this.regionalCommunity;
    }

}
