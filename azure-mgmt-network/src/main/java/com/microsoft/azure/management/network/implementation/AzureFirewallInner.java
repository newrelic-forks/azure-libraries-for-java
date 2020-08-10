/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import java.util.List;
import com.microsoft.azure.management.network.AzureFirewallApplicationRuleCollection;
import com.microsoft.azure.management.network.AzureFirewallNatRuleCollection;
import com.microsoft.azure.management.network.AzureFirewallNetworkRuleCollection;
import com.microsoft.azure.management.network.AzureFirewallIPConfiguration;
import com.microsoft.azure.management.network.ProvisioningState;
import com.microsoft.azure.management.network.AzureFirewallThreatIntelMode;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.HubIPAddresses;
import com.microsoft.azure.management.network.AzureFirewallIpGroups;
import com.microsoft.azure.management.network.AzureFirewallSku;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Azure Firewall resource.
 */
@JsonFlatten
@SkipParentValidation
public class AzureFirewallInner extends Resource {
    /**
     * Collection of application rule collections used by Azure Firewall.
     */
    @JsonProperty(value = "properties.applicationRuleCollections")
    private List<AzureFirewallApplicationRuleCollection> applicationRuleCollections;

    /**
     * Collection of NAT rule collections used by Azure Firewall.
     */
    @JsonProperty(value = "properties.natRuleCollections")
    private List<AzureFirewallNatRuleCollection> natRuleCollections;

    /**
     * Collection of network rule collections used by Azure Firewall.
     */
    @JsonProperty(value = "properties.networkRuleCollections")
    private List<AzureFirewallNetworkRuleCollection> networkRuleCollections;

    /**
     * IP configuration of the Azure Firewall resource.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<AzureFirewallIPConfiguration> ipConfigurations;

    /**
     * IP configuration of the Azure Firewall used for management traffic.
     */
    @JsonProperty(value = "properties.managementIpConfiguration")
    private AzureFirewallIPConfiguration managementIpConfiguration;

    /**
     * The provisioning state of the Azure firewall resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The operation mode for Threat Intelligence. Possible values include:
     * 'Alert', 'Deny', 'Off'.
     */
    @JsonProperty(value = "properties.threatIntelMode")
    private AzureFirewallThreatIntelMode threatIntelMode;

    /**
     * The virtualHub to which the firewall belongs.
     */
    @JsonProperty(value = "properties.virtualHub")
    private SubResource virtualHub;

    /**
     * The firewallPolicy associated with this azure firewall.
     */
    @JsonProperty(value = "properties.firewallPolicy")
    private SubResource firewallPolicy;

    /**
     * IP addresses associated with AzureFirewall.
     */
    @JsonProperty(value = "properties.hubIpAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private HubIPAddresses hubIpAddresses;

    /**
     * IpGroups associated with AzureFirewall.
     */
    @JsonProperty(value = "properties.ipGroups", access = JsonProperty.Access.WRITE_ONLY)
    private List<AzureFirewallIpGroups> ipGroups;

    /**
     * The Azure Firewall Resource SKU.
     */
    @JsonProperty(value = "properties.sku")
    private AzureFirewallSku sku;

    /**
     * The additional properties used to further config this azure firewall.
     */
    @JsonProperty(value = "properties.additionalProperties")
    private Map<String, String> additionalProperties;

    /**
     * A list of availability zones denoting where the resource needs to come
     * from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get collection of application rule collections used by Azure Firewall.
     *
     * @return the applicationRuleCollections value
     */
    public List<AzureFirewallApplicationRuleCollection> applicationRuleCollections() {
        return this.applicationRuleCollections;
    }

    /**
     * Set collection of application rule collections used by Azure Firewall.
     *
     * @param applicationRuleCollections the applicationRuleCollections value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withApplicationRuleCollections(List<AzureFirewallApplicationRuleCollection> applicationRuleCollections) {
        this.applicationRuleCollections = applicationRuleCollections;
        return this;
    }

    /**
     * Get collection of NAT rule collections used by Azure Firewall.
     *
     * @return the natRuleCollections value
     */
    public List<AzureFirewallNatRuleCollection> natRuleCollections() {
        return this.natRuleCollections;
    }

    /**
     * Set collection of NAT rule collections used by Azure Firewall.
     *
     * @param natRuleCollections the natRuleCollections value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withNatRuleCollections(List<AzureFirewallNatRuleCollection> natRuleCollections) {
        this.natRuleCollections = natRuleCollections;
        return this;
    }

    /**
     * Get collection of network rule collections used by Azure Firewall.
     *
     * @return the networkRuleCollections value
     */
    public List<AzureFirewallNetworkRuleCollection> networkRuleCollections() {
        return this.networkRuleCollections;
    }

    /**
     * Set collection of network rule collections used by Azure Firewall.
     *
     * @param networkRuleCollections the networkRuleCollections value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withNetworkRuleCollections(List<AzureFirewallNetworkRuleCollection> networkRuleCollections) {
        this.networkRuleCollections = networkRuleCollections;
        return this;
    }

    /**
     * Get iP configuration of the Azure Firewall resource.
     *
     * @return the ipConfigurations value
     */
    public List<AzureFirewallIPConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set iP configuration of the Azure Firewall resource.
     *
     * @param ipConfigurations the ipConfigurations value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withIpConfigurations(List<AzureFirewallIPConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get iP configuration of the Azure Firewall used for management traffic.
     *
     * @return the managementIpConfiguration value
     */
    public AzureFirewallIPConfiguration managementIpConfiguration() {
        return this.managementIpConfiguration;
    }

    /**
     * Set iP configuration of the Azure Firewall used for management traffic.
     *
     * @param managementIpConfiguration the managementIpConfiguration value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withManagementIpConfiguration(AzureFirewallIPConfiguration managementIpConfiguration) {
        this.managementIpConfiguration = managementIpConfiguration;
        return this;
    }

    /**
     * Get the provisioning state of the Azure firewall resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the operation mode for Threat Intelligence. Possible values include: 'Alert', 'Deny', 'Off'.
     *
     * @return the threatIntelMode value
     */
    public AzureFirewallThreatIntelMode threatIntelMode() {
        return this.threatIntelMode;
    }

    /**
     * Set the operation mode for Threat Intelligence. Possible values include: 'Alert', 'Deny', 'Off'.
     *
     * @param threatIntelMode the threatIntelMode value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode) {
        this.threatIntelMode = threatIntelMode;
        return this;
    }

    /**
     * Get the virtualHub to which the firewall belongs.
     *
     * @return the virtualHub value
     */
    public SubResource virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub to which the firewall belongs.
     *
     * @param virtualHub the virtualHub value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get the firewallPolicy associated with this azure firewall.
     *
     * @return the firewallPolicy value
     */
    public SubResource firewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * Set the firewallPolicy associated with this azure firewall.
     *
     * @param firewallPolicy the firewallPolicy value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withFirewallPolicy(SubResource firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
        return this;
    }

    /**
     * Get iP addresses associated with AzureFirewall.
     *
     * @return the hubIpAddresses value
     */
    public HubIPAddresses hubIpAddresses() {
        return this.hubIpAddresses;
    }

    /**
     * Get ipGroups associated with AzureFirewall.
     *
     * @return the ipGroups value
     */
    public List<AzureFirewallIpGroups> ipGroups() {
        return this.ipGroups;
    }

    /**
     * Get the Azure Firewall Resource SKU.
     *
     * @return the sku value
     */
    public AzureFirewallSku sku() {
        return this.sku;
    }

    /**
     * Set the Azure Firewall Resource SKU.
     *
     * @param sku the sku value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withSku(AzureFirewallSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the additional properties used to further config this azure firewall.
     *
     * @return the additionalProperties value
     */
    public Map<String, String> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additional properties used to further config this azure firewall.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withAdditionalProperties(Map<String, String> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get a list of availability zones denoting where the resource needs to come from.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set a list of availability zones denoting where the resource needs to come from.
     *
     * @param zones the zones value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withId(String id) {
        this.id = id;
        return this;
    }

}
