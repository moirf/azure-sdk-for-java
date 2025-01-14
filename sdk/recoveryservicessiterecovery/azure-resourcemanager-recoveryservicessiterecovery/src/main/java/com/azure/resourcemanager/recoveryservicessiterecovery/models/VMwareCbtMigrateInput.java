// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** VMwareCbt specific migrate input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("VMwareCbt")
@Fluent
public final class VMwareCbtMigrateInput extends MigrateProviderSpecificInput {
    /*
     * A value indicating whether VM is to be shutdown.
     */
    @JsonProperty(value = "performShutdown", required = true)
    private String performShutdown;

    /** Creates an instance of VMwareCbtMigrateInput class. */
    public VMwareCbtMigrateInput() {
    }

    /**
     * Get the performShutdown property: A value indicating whether VM is to be shutdown.
     *
     * @return the performShutdown value.
     */
    public String performShutdown() {
        return this.performShutdown;
    }

    /**
     * Set the performShutdown property: A value indicating whether VM is to be shutdown.
     *
     * @param performShutdown the performShutdown value to set.
     * @return the VMwareCbtMigrateInput object itself.
     */
    public VMwareCbtMigrateInput withPerformShutdown(String performShutdown) {
        this.performShutdown = performShutdown;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (performShutdown() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property performShutdown in model VMwareCbtMigrateInput"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VMwareCbtMigrateInput.class);
}
