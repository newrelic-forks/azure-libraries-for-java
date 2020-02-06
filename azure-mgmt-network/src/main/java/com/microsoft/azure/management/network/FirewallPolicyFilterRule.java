/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Firewall Policy Filter Rule.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleType", defaultImpl = FirewallPolicyFilterRule.class)
@JsonTypeName("FirewallPolicyFilterRule")
public class FirewallPolicyFilterRule extends FirewallPolicyRule {
    /**
     * The action type of a Filter rule.
     */
    @JsonProperty(value = "action")
    private FirewallPolicyFilterRuleAction action;

    /**
     * Collection of rule conditions used by a rule.
     */
    @JsonProperty(value = "ruleConditions")
    private List<FirewallPolicyRuleCondition> ruleConditions;

    /**
     * Get the action type of a Filter rule.
     *
     * @return the action value
     */
    public FirewallPolicyFilterRuleAction action() {
        return this.action;
    }

    /**
     * Set the action type of a Filter rule.
     *
     * @param action the action value to set
     * @return the FirewallPolicyFilterRule object itself.
     */
    public FirewallPolicyFilterRule withAction(FirewallPolicyFilterRuleAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get collection of rule conditions used by a rule.
     *
     * @return the ruleConditions value
     */
    public List<FirewallPolicyRuleCondition> ruleConditions() {
        return this.ruleConditions;
    }

    /**
     * Set collection of rule conditions used by a rule.
     *
     * @param ruleConditions the ruleConditions value to set
     * @return the FirewallPolicyFilterRule object itself.
     */
    public FirewallPolicyFilterRule withRuleConditions(List<FirewallPolicyRuleCondition> ruleConditions) {
        this.ruleConditions = ruleConditions;
        return this;
    }

}
