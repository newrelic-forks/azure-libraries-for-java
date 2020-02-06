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
 * Describes the connection monitor endpoint filter item.
 */
public class ConnectionMonitorEndpointFilterItem {
    /**
     * The type of item included in the filter. Currently only 'AgentAddress'
     * is supported. Possible values include: 'AgentAddress'.
     */
    @JsonProperty(value = "type")
    private ConnectionMonitorEndpointFilterItemType type;

    /**
     * The address of the filter item.
     */
    @JsonProperty(value = "address")
    private String address;

    /**
     * Get the type of item included in the filter. Currently only 'AgentAddress' is supported. Possible values include: 'AgentAddress'.
     *
     * @return the type value
     */
    public ConnectionMonitorEndpointFilterItemType type() {
        return this.type;
    }

    /**
     * Set the type of item included in the filter. Currently only 'AgentAddress' is supported. Possible values include: 'AgentAddress'.
     *
     * @param type the type value to set
     * @return the ConnectionMonitorEndpointFilterItem object itself.
     */
    public ConnectionMonitorEndpointFilterItem withType(ConnectionMonitorEndpointFilterItemType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the address of the filter item.
     *
     * @return the address value
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the address of the filter item.
     *
     * @param address the address value to set
     * @return the ConnectionMonitorEndpointFilterItem object itself.
     */
    public ConnectionMonitorEndpointFilterItem withAddress(String address) {
        this.address = address;
        return this;
    }

}
