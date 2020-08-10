/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties for the container service agent pool profile.
 */
public class ManagedClusterAgentPoolProfileProperties {
    /**
     * Number of agents (VMs) to host docker containers. Allowed values must be
     * in the range of 0 to 100 (inclusive). The default value is 1.
     */
    @JsonProperty(value = "count", required = true)
    private int count;

    /**
     * Size of agent VMs. Possible values include: 'Standard_A1',
     * 'Standard_A10', 'Standard_A11', 'Standard_A1_v2', 'Standard_A2',
     * 'Standard_A2_v2', 'Standard_A2m_v2', 'Standard_A3', 'Standard_A4',
     * 'Standard_A4_v2', 'Standard_A4m_v2', 'Standard_A5', 'Standard_A6',
     * 'Standard_A7', 'Standard_A8', 'Standard_A8_v2', 'Standard_A8m_v2',
     * 'Standard_A9', 'Standard_B2ms', 'Standard_B2s', 'Standard_B4ms',
     * 'Standard_B8ms', 'Standard_D1', 'Standard_D11', 'Standard_D11_v2',
     * 'Standard_D11_v2_Promo', 'Standard_D12', 'Standard_D12_v2',
     * 'Standard_D12_v2_Promo', 'Standard_D13', 'Standard_D13_v2',
     * 'Standard_D13_v2_Promo', 'Standard_D14', 'Standard_D14_v2',
     * 'Standard_D14_v2_Promo', 'Standard_D15_v2', 'Standard_D16_v3',
     * 'Standard_D16s_v3', 'Standard_D1_v2', 'Standard_D2', 'Standard_D2_v2',
     * 'Standard_D2_v2_Promo', 'Standard_D2_v3', 'Standard_D2s_v3',
     * 'Standard_D3', 'Standard_D32_v3', 'Standard_D32s_v3', 'Standard_D3_v2',
     * 'Standard_D3_v2_Promo', 'Standard_D4', 'Standard_D4_v2',
     * 'Standard_D4_v2_Promo', 'Standard_D4_v3', 'Standard_D4s_v3',
     * 'Standard_D5_v2', 'Standard_D5_v2_Promo', 'Standard_D64_v3',
     * 'Standard_D64s_v3', 'Standard_D8_v3', 'Standard_D8s_v3', 'Standard_DS1',
     * 'Standard_DS11', 'Standard_DS11_v2', 'Standard_DS11_v2_Promo',
     * 'Standard_DS12', 'Standard_DS12_v2', 'Standard_DS12_v2_Promo',
     * 'Standard_DS13', 'Standard_DS13-2_v2', 'Standard_DS13-4_v2',
     * 'Standard_DS13_v2', 'Standard_DS13_v2_Promo', 'Standard_DS14',
     * 'Standard_DS14-4_v2', 'Standard_DS14-8_v2', 'Standard_DS14_v2',
     * 'Standard_DS14_v2_Promo', 'Standard_DS15_v2', 'Standard_DS1_v2',
     * 'Standard_DS2', 'Standard_DS2_v2', 'Standard_DS2_v2_Promo',
     * 'Standard_DS3', 'Standard_DS3_v2', 'Standard_DS3_v2_Promo',
     * 'Standard_DS4', 'Standard_DS4_v2', 'Standard_DS4_v2_Promo',
     * 'Standard_DS5_v2', 'Standard_DS5_v2_Promo', 'Standard_E16_v3',
     * 'Standard_E16s_v3', 'Standard_E2_v3', 'Standard_E2s_v3',
     * 'Standard_E32-16s_v3', 'Standard_E32-8s_v3', 'Standard_E32_v3',
     * 'Standard_E32s_v3', 'Standard_E4_v3', 'Standard_E4s_v3',
     * 'Standard_E64-16s_v3', 'Standard_E64-32s_v3', 'Standard_E64_v3',
     * 'Standard_E64s_v3', 'Standard_E8_v3', 'Standard_E8s_v3', 'Standard_F1',
     * 'Standard_F16', 'Standard_F16s', 'Standard_F16s_v2', 'Standard_F1s',
     * 'Standard_F2', 'Standard_F2s', 'Standard_F2s_v2', 'Standard_F32s_v2',
     * 'Standard_F4', 'Standard_F4s', 'Standard_F4s_v2', 'Standard_F64s_v2',
     * 'Standard_F72s_v2', 'Standard_F8', 'Standard_F8s', 'Standard_F8s_v2',
     * 'Standard_G1', 'Standard_G2', 'Standard_G3', 'Standard_G4',
     * 'Standard_G5', 'Standard_GS1', 'Standard_GS2', 'Standard_GS3',
     * 'Standard_GS4', 'Standard_GS4-4', 'Standard_GS4-8', 'Standard_GS5',
     * 'Standard_GS5-16', 'Standard_GS5-8', 'Standard_H16', 'Standard_H16m',
     * 'Standard_H16mr', 'Standard_H16r', 'Standard_H8', 'Standard_H8m',
     * 'Standard_L16s', 'Standard_L32s', 'Standard_L4s', 'Standard_L8s',
     * 'Standard_M128-32ms', 'Standard_M128-64ms', 'Standard_M128ms',
     * 'Standard_M128s', 'Standard_M64-16ms', 'Standard_M64-32ms',
     * 'Standard_M64ms', 'Standard_M64s', 'Standard_NC12', 'Standard_NC12s_v2',
     * 'Standard_NC12s_v3', 'Standard_NC24', 'Standard_NC24r',
     * 'Standard_NC24rs_v2', 'Standard_NC24rs_v3', 'Standard_NC24s_v2',
     * 'Standard_NC24s_v3', 'Standard_NC6', 'Standard_NC6s_v2',
     * 'Standard_NC6s_v3', 'Standard_ND12s', 'Standard_ND24rs',
     * 'Standard_ND24s', 'Standard_ND6s', 'Standard_NV12', 'Standard_NV24',
     * 'Standard_NV6'.
     */
    @JsonProperty(value = "vmSize", required = true)
    private ContainerServiceVMSizeTypes vmSize;

    /**
     * OS Disk Size in GB to be used to specify the disk size for every machine
     * in this master/agent pool. If you specify 0, it will apply the default
     * osDisk size according to the vmSize specified.
     */
    @JsonProperty(value = "osDiskSizeGB")
    private Integer osDiskSizeGB;

    /**
     * VNet SubnetID specifies the VNet's subnet identifier.
     */
    @JsonProperty(value = "vnetSubnetID")
    private String vnetSubnetID;

    /**
     * Maximum number of pods that can run on a node.
     */
    @JsonProperty(value = "maxPods")
    private Integer maxPods;

    /**
     * OsType to be used to specify os type. Choose from Linux and Windows.
     * Default to Linux. Possible values include: 'Linux', 'Windows'.
     */
    @JsonProperty(value = "osType")
    private OSType osType;

    /**
     * Maximum number of nodes for auto-scaling.
     */
    @JsonProperty(value = "maxCount")
    private Integer maxCount;

    /**
     * Minimum number of nodes for auto-scaling.
     */
    @JsonProperty(value = "minCount")
    private Integer minCount;

    /**
     * Whether to enable auto-scaler.
     */
    @JsonProperty(value = "enableAutoScaling")
    private Boolean enableAutoScaling;

    /**
     * AgentPoolType represents types of an agent pool. Possible values
     * include: 'VirtualMachineScaleSets', 'AvailabilitySet'.
     */
    @JsonProperty(value = "type")
    private AgentPoolType type;

    /**
     * AgentPoolMode represents mode of an agent pool. Possible values include:
     * 'System', 'User'.
     */
    @JsonProperty(value = "mode")
    private AgentPoolMode mode;

    /**
     * Version of orchestrator specified when creating the managed cluster.
     */
    @JsonProperty(value = "orchestratorVersion")
    private String orchestratorVersion;

    /**
     * The current deployment or provisioning state, which only appears in the
     * response.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Availability zones for nodes. Must use VirtualMachineScaleSets
     * AgentPoolType.
     */
    @JsonProperty(value = "availabilityZones")
    private List<String> availabilityZones;

    /**
     * Enable public IP for nodes.
     */
    @JsonProperty(value = "enableNodePublicIP")
    private Boolean enableNodePublicIP;

    /**
     * ScaleSetPriority to be used to specify virtual machine scale set
     * priority. Default to regular. Possible values include: 'Spot', 'Low',
     * 'Regular'.
     */
    @JsonProperty(value = "scaleSetPriority")
    private ScaleSetPriority scaleSetPriority;

    /**
     * ScaleSetEvictionPolicy to be used to specify eviction policy for Spot or
     * low priority virtual machine scale set. Default to Delete. Possible
     * values include: 'Delete', 'Deallocate'.
     */
    @JsonProperty(value = "scaleSetEvictionPolicy")
    private ScaleSetEvictionPolicy scaleSetEvictionPolicy;

    /**
     * SpotMaxPrice to be used to specify the maximum price you are willing to
     * pay in US Dollars. Possible values are any decimal value greater than
     * zero or -1 which indicates default price to be up-to on-demand.
     */
    @JsonProperty(value = "spotMaxPrice")
    private Double spotMaxPrice;

    /**
     * Agent pool tags to be persisted on the agent pool virtual machine scale
     * set.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Agent pool node labels to be persisted across all nodes in agent pool.
     */
    @JsonProperty(value = "nodeLabels")
    private Map<String, String> nodeLabels;

    /**
     * Taints added to new nodes during node pool create and scale. For
     * example, key=value:NoSchedule.
     */
    @JsonProperty(value = "nodeTaints")
    private List<String> nodeTaints;

    /**
     * Get number of agents (VMs) to host docker containers. Allowed values must be in the range of 0 to 100 (inclusive). The default value is 1.
     *
     * @return the count value
     */
    public int count() {
        return this.count;
    }

    /**
     * Set number of agents (VMs) to host docker containers. Allowed values must be in the range of 0 to 100 (inclusive). The default value is 1.
     *
     * @param count the count value to set
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get size of agent VMs. Possible values include: 'Standard_A1', 'Standard_A10', 'Standard_A11', 'Standard_A1_v2', 'Standard_A2', 'Standard_A2_v2', 'Standard_A2m_v2', 'Standard_A3', 'Standard_A4', 'Standard_A4_v2', 'Standard_A4m_v2', 'Standard_A5', 'Standard_A6', 'Standard_A7', 'Standard_A8', 'Standard_A8_v2', 'Standard_A8m_v2', 'Standard_A9', 'Standard_B2ms', 'Standard_B2s', 'Standard_B4ms', 'Standard_B8ms', 'Standard_D1', 'Standard_D11', 'Standard_D11_v2', 'Standard_D11_v2_Promo', 'Standard_D12', 'Standard_D12_v2', 'Standard_D12_v2_Promo', 'Standard_D13', 'Standard_D13_v2', 'Standard_D13_v2_Promo', 'Standard_D14', 'Standard_D14_v2', 'Standard_D14_v2_Promo', 'Standard_D15_v2', 'Standard_D16_v3', 'Standard_D16s_v3', 'Standard_D1_v2', 'Standard_D2', 'Standard_D2_v2', 'Standard_D2_v2_Promo', 'Standard_D2_v3', 'Standard_D2s_v3', 'Standard_D3', 'Standard_D32_v3', 'Standard_D32s_v3', 'Standard_D3_v2', 'Standard_D3_v2_Promo', 'Standard_D4', 'Standard_D4_v2', 'Standard_D4_v2_Promo', 'Standard_D4_v3', 'Standard_D4s_v3', 'Standard_D5_v2', 'Standard_D5_v2_Promo', 'Standard_D64_v3', 'Standard_D64s_v3', 'Standard_D8_v3', 'Standard_D8s_v3', 'Standard_DS1', 'Standard_DS11', 'Standard_DS11_v2', 'Standard_DS11_v2_Promo', 'Standard_DS12', 'Standard_DS12_v2', 'Standard_DS12_v2_Promo', 'Standard_DS13', 'Standard_DS13-2_v2', 'Standard_DS13-4_v2', 'Standard_DS13_v2', 'Standard_DS13_v2_Promo', 'Standard_DS14', 'Standard_DS14-4_v2', 'Standard_DS14-8_v2', 'Standard_DS14_v2', 'Standard_DS14_v2_Promo', 'Standard_DS15_v2', 'Standard_DS1_v2', 'Standard_DS2', 'Standard_DS2_v2', 'Standard_DS2_v2_Promo', 'Standard_DS3', 'Standard_DS3_v2', 'Standard_DS3_v2_Promo', 'Standard_DS4', 'Standard_DS4_v2', 'Standard_DS4_v2_Promo', 'Standard_DS5_v2', 'Standard_DS5_v2_Promo', 'Standard_E16_v3', 'Standard_E16s_v3', 'Standard_E2_v3', 'Standard_E2s_v3', 'Standard_E32-16s_v3', 'Standard_E32-8s_v3', 'Standard_E32_v3', 'Standard_E32s_v3', 'Standard_E4_v3', 'Standard_E4s_v3', 'Standard_E64-16s_v3', 'Standard_E64-32s_v3', 'Standard_E64_v3', 'Standard_E64s_v3', 'Standard_E8_v3', 'Standard_E8s_v3', 'Standard_F1', 'Standard_F16', 'Standard_F16s', 'Standard_F16s_v2', 'Standard_F1s', 'Standard_F2', 'Standard_F2s', 'Standard_F2s_v2', 'Standard_F32s_v2', 'Standard_F4', 'Standard_F4s', 'Standard_F4s_v2', 'Standard_F64s_v2', 'Standard_F72s_v2', 'Standard_F8', 'Standard_F8s', 'Standard_F8s_v2', 'Standard_G1', 'Standard_G2', 'Standard_G3', 'Standard_G4', 'Standard_G5', 'Standard_GS1', 'Standard_GS2', 'Standard_GS3', 'Standard_GS4', 'Standard_GS4-4', 'Standard_GS4-8', 'Standard_GS5', 'Standard_GS5-16', 'Standard_GS5-8', 'Standard_H16', 'Standard_H16m', 'Standard_H16mr', 'Standard_H16r', 'Standard_H8', 'Standard_H8m', 'Standard_L16s', 'Standard_L32s', 'Standard_L4s', 'Standard_L8s', 'Standard_M128-32ms', 'Standard_M128-64ms', 'Standard_M128ms', 'Standard_M128s', 'Standard_M64-16ms', 'Standard_M64-32ms', 'Standard_M64ms', 'Standard_M64s', 'Standard_NC12', 'Standard_NC12s_v2', 'Standard_NC12s_v3', 'Standard_NC24', 'Standard_NC24r', 'Standard_NC24rs_v2', 'Standard_NC24rs_v3', 'Standard_NC24s_v2', 'Standard_NC24s_v3', 'Standard_NC6', 'Standard_NC6s_v2', 'Standard_NC6s_v3', 'Standard_ND12s', 'Standard_ND24rs', 'Standard_ND24s', 'Standard_ND6s', 'Standard_NV12', 'Standard_NV24', 'Standard_NV6'.
     *
     * @return the vmSize value
     */
    public ContainerServiceVMSizeTypes vmSize() {
        return this.vmSize;
    }

    /**
     * Set size of agent VMs. Possible values include: 'Standard_A1', 'Standard_A10', 'Standard_A11', 'Standard_A1_v2', 'Standard_A2', 'Standard_A2_v2', 'Standard_A2m_v2', 'Standard_A3', 'Standard_A4', 'Standard_A4_v2', 'Standard_A4m_v2', 'Standard_A5', 'Standard_A6', 'Standard_A7', 'Standard_A8', 'Standard_A8_v2', 'Standard_A8m_v2', 'Standard_A9', 'Standard_B2ms', 'Standard_B2s', 'Standard_B4ms', 'Standard_B8ms', 'Standard_D1', 'Standard_D11', 'Standard_D11_v2', 'Standard_D11_v2_Promo', 'Standard_D12', 'Standard_D12_v2', 'Standard_D12_v2_Promo', 'Standard_D13', 'Standard_D13_v2', 'Standard_D13_v2_Promo', 'Standard_D14', 'Standard_D14_v2', 'Standard_D14_v2_Promo', 'Standard_D15_v2', 'Standard_D16_v3', 'Standard_D16s_v3', 'Standard_D1_v2', 'Standard_D2', 'Standard_D2_v2', 'Standard_D2_v2_Promo', 'Standard_D2_v3', 'Standard_D2s_v3', 'Standard_D3', 'Standard_D32_v3', 'Standard_D32s_v3', 'Standard_D3_v2', 'Standard_D3_v2_Promo', 'Standard_D4', 'Standard_D4_v2', 'Standard_D4_v2_Promo', 'Standard_D4_v3', 'Standard_D4s_v3', 'Standard_D5_v2', 'Standard_D5_v2_Promo', 'Standard_D64_v3', 'Standard_D64s_v3', 'Standard_D8_v3', 'Standard_D8s_v3', 'Standard_DS1', 'Standard_DS11', 'Standard_DS11_v2', 'Standard_DS11_v2_Promo', 'Standard_DS12', 'Standard_DS12_v2', 'Standard_DS12_v2_Promo', 'Standard_DS13', 'Standard_DS13-2_v2', 'Standard_DS13-4_v2', 'Standard_DS13_v2', 'Standard_DS13_v2_Promo', 'Standard_DS14', 'Standard_DS14-4_v2', 'Standard_DS14-8_v2', 'Standard_DS14_v2', 'Standard_DS14_v2_Promo', 'Standard_DS15_v2', 'Standard_DS1_v2', 'Standard_DS2', 'Standard_DS2_v2', 'Standard_DS2_v2_Promo', 'Standard_DS3', 'Standard_DS3_v2', 'Standard_DS3_v2_Promo', 'Standard_DS4', 'Standard_DS4_v2', 'Standard_DS4_v2_Promo', 'Standard_DS5_v2', 'Standard_DS5_v2_Promo', 'Standard_E16_v3', 'Standard_E16s_v3', 'Standard_E2_v3', 'Standard_E2s_v3', 'Standard_E32-16s_v3', 'Standard_E32-8s_v3', 'Standard_E32_v3', 'Standard_E32s_v3', 'Standard_E4_v3', 'Standard_E4s_v3', 'Standard_E64-16s_v3', 'Standard_E64-32s_v3', 'Standard_E64_v3', 'Standard_E64s_v3', 'Standard_E8_v3', 'Standard_E8s_v3', 'Standard_F1', 'Standard_F16', 'Standard_F16s', 'Standard_F16s_v2', 'Standard_F1s', 'Standard_F2', 'Standard_F2s', 'Standard_F2s_v2', 'Standard_F32s_v2', 'Standard_F4', 'Standard_F4s', 'Standard_F4s_v2', 'Standard_F64s_v2', 'Standard_F72s_v2', 'Standard_F8', 'Standard_F8s', 'Standard_F8s_v2', 'Standard_G1', 'Standard_G2', 'Standard_G3', 'Standard_G4', 'Standard_G5', 'Standard_GS1', 'Standard_GS2', 'Standard_GS3', 'Standard_GS4', 'Standard_GS4-4', 'Standard_GS4-8', 'Standard_GS5', 'Standard_GS5-16', 'Standard_GS5-8', 'Standard_H16', 'Standard_H16m', 'Standard_H16mr', 'Standard_H16r', 'Standard_H8', 'Standard_H8m', 'Standard_L16s', 'Standard_L32s', 'Standard_L4s', 'Standard_L8s', 'Standard_M128-32ms', 'Standard_M128-64ms', 'Standard_M128ms', 'Standard_M128s', 'Standard_M64-16ms', 'Standard_M64-32ms', 'Standard_M64ms', 'Standard_M64s', 'Standard_NC12', 'Standard_NC12s_v2', 'Standard_NC12s_v3', 'Standard_NC24', 'Standard_NC24r', 'Standard_NC24rs_v2', 'Standard_NC24rs_v3', 'Standard_NC24s_v2', 'Standard_NC24s_v3', 'Standard_NC6', 'Standard_NC6s_v2', 'Standard_NC6s_v3', 'Standard_ND12s', 'Standard_ND24rs', 'Standard_ND24s', 'Standard_ND6s', 'Standard_NV12', 'Standard_NV24', 'Standard_NV6'.
     *
     * @param vmSize the vmSize value to set
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withVmSize(ContainerServiceVMSizeTypes vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get oS Disk Size in GB to be used to specify the disk size for every machine in this master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified.
     *
     * @return the osDiskSizeGB value
     */
    public Integer osDiskSizeGB() {
        return this.osDiskSizeGB;
    }

    /**
     * Set oS Disk Size in GB to be used to specify the disk size for every machine in this master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified.
     *
     * @param osDiskSizeGB the osDiskSizeGB value to set
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withOsDiskSizeGB(Integer osDiskSizeGB) {
        this.osDiskSizeGB = osDiskSizeGB;
        return this;
    }

    /**
     * Get vNet SubnetID specifies the VNet's subnet identifier.
     *
     * @return the vnetSubnetID value
     */
    public String vnetSubnetID() {
        return this.vnetSubnetID;
    }

    /**
     * Set vNet SubnetID specifies the VNet's subnet identifier.
     *
     * @param vnetSubnetID the vnetSubnetID value to set
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withVnetSubnetID(String vnetSubnetID) {
        this.vnetSubnetID = vnetSubnetID;
        return this;
    }

    /**
     * Get maximum number of pods that can run on a node.
     *
     * @return the maxPods value
     */
    public Integer maxPods() {
        return this.maxPods;
    }

    /**
     * Set maximum number of pods that can run on a node.
     *
     * @param maxPods the maxPods value to set
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withMaxPods(Integer maxPods) {
        this.maxPods = maxPods;
        return this;
    }

    /**
     * Get osType to be used to specify os type. Choose from Linux and Windows. Default to Linux. Possible values include: 'Linux', 'Windows'.
     *
     * @return the osType value
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Set osType to be used to specify os type. Choose from Linux and Windows. Default to Linux. Possible values include: 'Linux', 'Windows'.
     *
     * @param osType the osType value to set
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withOsType(OSType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get maximum number of nodes for auto-scaling.
     *
     * @return the maxCount value
     */
    public Integer maxCount() {
        return this.maxCount;
    }

    /**
     * Set maximum number of nodes for auto-scaling.
     *
     * @param maxCount the maxCount value to set
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * Get minimum number of nodes for auto-scaling.
     *
     * @return the minCount value
     */
    public Integer minCount() {
        return this.minCount;
    }

    /**
     * Set minimum number of nodes for auto-scaling.
     *
     * @param minCount the minCount value to set
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withMinCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }

    /**
     * Get whether to enable auto-scaler.
     *
     * @return the enableAutoScaling value
     */
    public Boolean enableAutoScaling() {
        return this.enableAutoScaling;
    }

    /**
     * Set whether to enable auto-scaler.
     *
     * @param enableAutoScaling the enableAutoScaling value to set
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withEnableAutoScaling(Boolean enableAutoScaling) {
        this.enableAutoScaling = enableAutoScaling;
        return this;
    }

    /**
     * Get agentPoolType represents types of an agent pool. Possible values include: 'VirtualMachineScaleSets', 'AvailabilitySet'.
     *
     * @return the type value
     */
    public AgentPoolType type() {
        return this.type;
    }

    /**
     * Set agentPoolType represents types of an agent pool. Possible values include: 'VirtualMachineScaleSets', 'AvailabilitySet'.
     *
     * @param type the type value to set
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withType(AgentPoolType type) {
        this.type = type;
        return this;
    }

    /**
     * Get agentPoolMode represents mode of an agent pool. Possible values include: 'System', 'User'.
     *
     * @return the mode value
     */
    public AgentPoolMode mode() {
        return this.mode;
    }

    /**
     * Set agentPoolMode represents mode of an agent pool. Possible values include: 'System', 'User'.
     *
     * @param mode the mode value to set
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withMode(AgentPoolMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get version of orchestrator specified when creating the managed cluster.
     *
     * @return the orchestratorVersion value
     */
    public String orchestratorVersion() {
        return this.orchestratorVersion;
    }

    /**
     * Set version of orchestrator specified when creating the managed cluster.
     *
     * @param orchestratorVersion the orchestratorVersion value to set
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withOrchestratorVersion(String orchestratorVersion) {
        this.orchestratorVersion = orchestratorVersion;
        return this;
    }

    /**
     * Get the current deployment or provisioning state, which only appears in the response.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get availability zones for nodes. Must use VirtualMachineScaleSets AgentPoolType.
     *
     * @return the availabilityZones value
     */
    public List<String> availabilityZones() {
        return this.availabilityZones;
    }

    /**
     * Set availability zones for nodes. Must use VirtualMachineScaleSets AgentPoolType.
     *
     * @param availabilityZones the availabilityZones value to set
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withAvailabilityZones(List<String> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    /**
     * Get enable public IP for nodes.
     *
     * @return the enableNodePublicIP value
     */
    public Boolean enableNodePublicIP() {
        return this.enableNodePublicIP;
    }

    /**
     * Set enable public IP for nodes.
     *
     * @param enableNodePublicIP the enableNodePublicIP value to set
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withEnableNodePublicIP(Boolean enableNodePublicIP) {
        this.enableNodePublicIP = enableNodePublicIP;
        return this;
    }

    /**
     * Get scaleSetPriority to be used to specify virtual machine scale set priority. Default to regular. Possible values include: 'Spot', 'Low', 'Regular'.
     *
     * @return the scaleSetPriority value
     */
    public ScaleSetPriority scaleSetPriority() {
        return this.scaleSetPriority;
    }

    /**
     * Set scaleSetPriority to be used to specify virtual machine scale set priority. Default to regular. Possible values include: 'Spot', 'Low', 'Regular'.
     *
     * @param scaleSetPriority the scaleSetPriority value to set
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withScaleSetPriority(ScaleSetPriority scaleSetPriority) {
        this.scaleSetPriority = scaleSetPriority;
        return this;
    }

    /**
     * Get scaleSetEvictionPolicy to be used to specify eviction policy for Spot or low priority virtual machine scale set. Default to Delete. Possible values include: 'Delete', 'Deallocate'.
     *
     * @return the scaleSetEvictionPolicy value
     */
    public ScaleSetEvictionPolicy scaleSetEvictionPolicy() {
        return this.scaleSetEvictionPolicy;
    }

    /**
     * Set scaleSetEvictionPolicy to be used to specify eviction policy for Spot or low priority virtual machine scale set. Default to Delete. Possible values include: 'Delete', 'Deallocate'.
     *
     * @param scaleSetEvictionPolicy the scaleSetEvictionPolicy value to set
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withScaleSetEvictionPolicy(ScaleSetEvictionPolicy scaleSetEvictionPolicy) {
        this.scaleSetEvictionPolicy = scaleSetEvictionPolicy;
        return this;
    }

    /**
     * Get spotMaxPrice to be used to specify the maximum price you are willing to pay in US Dollars. Possible values are any decimal value greater than zero or -1 which indicates default price to be up-to on-demand.
     *
     * @return the spotMaxPrice value
     */
    public Double spotMaxPrice() {
        return this.spotMaxPrice;
    }

    /**
     * Set spotMaxPrice to be used to specify the maximum price you are willing to pay in US Dollars. Possible values are any decimal value greater than zero or -1 which indicates default price to be up-to on-demand.
     *
     * @param spotMaxPrice the spotMaxPrice value to set
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withSpotMaxPrice(Double spotMaxPrice) {
        this.spotMaxPrice = spotMaxPrice;
        return this;
    }

    /**
     * Get agent pool tags to be persisted on the agent pool virtual machine scale set.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set agent pool tags to be persisted on the agent pool virtual machine scale set.
     *
     * @param tags the tags value to set
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get agent pool node labels to be persisted across all nodes in agent pool.
     *
     * @return the nodeLabels value
     */
    public Map<String, String> nodeLabels() {
        return this.nodeLabels;
    }

    /**
     * Set agent pool node labels to be persisted across all nodes in agent pool.
     *
     * @param nodeLabels the nodeLabels value to set
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withNodeLabels(Map<String, String> nodeLabels) {
        this.nodeLabels = nodeLabels;
        return this;
    }

    /**
     * Get taints added to new nodes during node pool create and scale. For example, key=value:NoSchedule.
     *
     * @return the nodeTaints value
     */
    public List<String> nodeTaints() {
        return this.nodeTaints;
    }

    /**
     * Set taints added to new nodes during node pool create and scale. For example, key=value:NoSchedule.
     *
     * @param nodeTaints the nodeTaints value to set
     * @return the ManagedClusterAgentPoolProfileProperties object itself.
     */
    public ManagedClusterAgentPoolProfileProperties withNodeTaints(List<String> nodeTaints) {
        this.nodeTaints = nodeTaints;
        return this;
    }

}
