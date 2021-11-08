// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The OverrideTaskStepProperties model. */
@Fluent
public final class OverrideTaskStepProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OverrideTaskStepProperties.class);

    /*
     * The source context against which run has to be queued.
     */
    @JsonProperty(value = "contextPath")
    private String contextPath;

    /*
     * The file against which run has to be queued.
     */
    @JsonProperty(value = "file")
    private String file;

    /*
     * Gets or sets the collection of override arguments to be used when
     * executing a build step.
     */
    @JsonProperty(value = "arguments")
    private List<Argument> arguments;

    /*
     * The name of the target build stage for the docker build.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * The collection of overridable values that can be passed when running a
     * Task.
     */
    @JsonProperty(value = "values")
    private List<SetValue> values;

    /*
     * Base64 encoded update trigger token that will be attached with the base
     * image trigger webhook.
     */
    @JsonProperty(value = "updateTriggerToken")
    private String updateTriggerToken;

    /**
     * Get the contextPath property: The source context against which run has to be queued.
     *
     * @return the contextPath value.
     */
    public String contextPath() {
        return this.contextPath;
    }

    /**
     * Set the contextPath property: The source context against which run has to be queued.
     *
     * @param contextPath the contextPath value to set.
     * @return the OverrideTaskStepProperties object itself.
     */
    public OverrideTaskStepProperties withContextPath(String contextPath) {
        this.contextPath = contextPath;
        return this;
    }

    /**
     * Get the file property: The file against which run has to be queued.
     *
     * @return the file value.
     */
    public String file() {
        return this.file;
    }

    /**
     * Set the file property: The file against which run has to be queued.
     *
     * @param file the file value to set.
     * @return the OverrideTaskStepProperties object itself.
     */
    public OverrideTaskStepProperties withFile(String file) {
        this.file = file;
        return this;
    }

    /**
     * Get the arguments property: Gets or sets the collection of override arguments to be used when executing a build
     * step.
     *
     * @return the arguments value.
     */
    public List<Argument> arguments() {
        return this.arguments;
    }

    /**
     * Set the arguments property: Gets or sets the collection of override arguments to be used when executing a build
     * step.
     *
     * @param arguments the arguments value to set.
     * @return the OverrideTaskStepProperties object itself.
     */
    public OverrideTaskStepProperties withArguments(List<Argument> arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * Get the target property: The name of the target build stage for the docker build.
     *
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: The name of the target build stage for the docker build.
     *
     * @param target the target value to set.
     * @return the OverrideTaskStepProperties object itself.
     */
    public OverrideTaskStepProperties withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the values property: The collection of overridable values that can be passed when running a Task.
     *
     * @return the values value.
     */
    public List<SetValue> values() {
        return this.values;
    }

    /**
     * Set the values property: The collection of overridable values that can be passed when running a Task.
     *
     * @param values the values value to set.
     * @return the OverrideTaskStepProperties object itself.
     */
    public OverrideTaskStepProperties withValues(List<SetValue> values) {
        this.values = values;
        return this;
    }

    /**
     * Get the updateTriggerToken property: Base64 encoded update trigger token that will be attached with the base
     * image trigger webhook.
     *
     * @return the updateTriggerToken value.
     */
    public String updateTriggerToken() {
        return this.updateTriggerToken;
    }

    /**
     * Set the updateTriggerToken property: Base64 encoded update trigger token that will be attached with the base
     * image trigger webhook.
     *
     * @param updateTriggerToken the updateTriggerToken value to set.
     * @return the OverrideTaskStepProperties object itself.
     */
    public OverrideTaskStepProperties withUpdateTriggerToken(String updateTriggerToken) {
        this.updateTriggerToken = updateTriggerToken;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (arguments() != null) {
            arguments().forEach(e -> e.validate());
        }
        if (values() != null) {
            values().forEach(e -> e.validate());
        }
    }
}