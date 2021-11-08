// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.models.PipelineRunRequest;
import com.azure.resourcemanager.containerregistry.models.PipelineRunResponse;
import com.azure.resourcemanager.containerregistry.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An object that represents a pipeline run for a container registry. */
@Fluent
public final class PipelineRunInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PipelineRunInner.class);

    /*
     * The properties of a pipeline run.
     */
    @JsonProperty(value = "properties")
    private PipelineRunProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: The properties of a pipeline run.
     *
     * @return the innerProperties value.
     */
    private PipelineRunProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: The provisioning state of a pipeline run.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the request property: The request parameters for a pipeline run.
     *
     * @return the request value.
     */
    public PipelineRunRequest request() {
        return this.innerProperties() == null ? null : this.innerProperties().request();
    }

    /**
     * Set the request property: The request parameters for a pipeline run.
     *
     * @param request the request value to set.
     * @return the PipelineRunInner object itself.
     */
    public PipelineRunInner withRequest(PipelineRunRequest request) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PipelineRunProperties();
        }
        this.innerProperties().withRequest(request);
        return this;
    }

    /**
     * Get the response property: The response of a pipeline run.
     *
     * @return the response value.
     */
    public PipelineRunResponse response() {
        return this.innerProperties() == null ? null : this.innerProperties().response();
    }

    /**
     * Get the forceUpdateTag property: How the pipeline run should be forced to recreate even if the pipeline run
     * configuration has not changed.
     *
     * @return the forceUpdateTag value.
     */
    public String forceUpdateTag() {
        return this.innerProperties() == null ? null : this.innerProperties().forceUpdateTag();
    }

    /**
     * Set the forceUpdateTag property: How the pipeline run should be forced to recreate even if the pipeline run
     * configuration has not changed.
     *
     * @param forceUpdateTag the forceUpdateTag value to set.
     * @return the PipelineRunInner object itself.
     */
    public PipelineRunInner withForceUpdateTag(String forceUpdateTag) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PipelineRunProperties();
        }
        this.innerProperties().withForceUpdateTag(forceUpdateTag);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}