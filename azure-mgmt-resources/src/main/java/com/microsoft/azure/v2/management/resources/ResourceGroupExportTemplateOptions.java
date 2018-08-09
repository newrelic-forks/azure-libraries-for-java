/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.v2.management.resources;

/**
 * The export template options.
 */
public enum ResourceGroupExportTemplateOptions {
    /**
     * Includes default parameter values.
     */
    INCLUDE_PARAMETER_DEFAULT_VALUE("IncludeParameterDefaultValue"),

    /**
     * Includes comments.
     */
    INCLUDE_COMMENTS("IncludeComments"),

    /**
     * Includes default parameter values and comments.
     */
    INCLUDE_BOTH("IncludeParameterDefaultValue, IncludeComments");

    private String value;

    ResourceGroupExportTemplateOptions(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}