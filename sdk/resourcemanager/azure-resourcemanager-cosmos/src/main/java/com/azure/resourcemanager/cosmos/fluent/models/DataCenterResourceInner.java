// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.models.ArmProxyResource;
import com.azure.resourcemanager.cosmos.models.DataCenterResourceProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A managed Cassandra data center. */
@Fluent
public final class DataCenterResourceInner extends ArmProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataCenterResourceInner.class);

    /*
     * Properties of a managed Cassandra data center.
     */
    @JsonProperty(value = "properties")
    private DataCenterResourceProperties properties;

    /**
     * Get the properties property: Properties of a managed Cassandra data center.
     *
     * @return the properties value.
     */
    public DataCenterResourceProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of a managed Cassandra data center.
     *
     * @param properties the properties value to set.
     * @return the DataCenterResourceInner object itself.
     */
    public DataCenterResourceInner withProperties(DataCenterResourceProperties properties) {
        this.properties = properties;
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
        if (properties() != null) {
            properties().validate();
        }
    }
}