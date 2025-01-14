// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.RouteMapRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of RouteMap resource. */
@Fluent
public final class RouteMapProperties {
    /*
     * List of connections which have this RoutMap associated for inbound traffic.
     */
    @JsonProperty(value = "associatedInboundConnections")
    private List<String> associatedInboundConnections;

    /*
     * List of connections which have this RoutMap associated for outbound traffic.
     */
    @JsonProperty(value = "associatedOutboundConnections")
    private List<String> associatedOutboundConnections;

    /*
     * List of RouteMap rules to be applied.
     */
    @JsonProperty(value = "rules")
    private List<RouteMapRule> rules;

    /*
     * The provisioning state of the RouteMap resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of RouteMapProperties class. */
    public RouteMapProperties() {
    }

    /**
     * Get the associatedInboundConnections property: List of connections which have this RoutMap associated for inbound
     * traffic.
     *
     * @return the associatedInboundConnections value.
     */
    public List<String> associatedInboundConnections() {
        return this.associatedInboundConnections;
    }

    /**
     * Set the associatedInboundConnections property: List of connections which have this RoutMap associated for inbound
     * traffic.
     *
     * @param associatedInboundConnections the associatedInboundConnections value to set.
     * @return the RouteMapProperties object itself.
     */
    public RouteMapProperties withAssociatedInboundConnections(List<String> associatedInboundConnections) {
        this.associatedInboundConnections = associatedInboundConnections;
        return this;
    }

    /**
     * Get the associatedOutboundConnections property: List of connections which have this RoutMap associated for
     * outbound traffic.
     *
     * @return the associatedOutboundConnections value.
     */
    public List<String> associatedOutboundConnections() {
        return this.associatedOutboundConnections;
    }

    /**
     * Set the associatedOutboundConnections property: List of connections which have this RoutMap associated for
     * outbound traffic.
     *
     * @param associatedOutboundConnections the associatedOutboundConnections value to set.
     * @return the RouteMapProperties object itself.
     */
    public RouteMapProperties withAssociatedOutboundConnections(List<String> associatedOutboundConnections) {
        this.associatedOutboundConnections = associatedOutboundConnections;
        return this;
    }

    /**
     * Get the rules property: List of RouteMap rules to be applied.
     *
     * @return the rules value.
     */
    public List<RouteMapRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: List of RouteMap rules to be applied.
     *
     * @param rules the rules value to set.
     * @return the RouteMapProperties object itself.
     */
    public RouteMapProperties withRules(List<RouteMapRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the RouteMap resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
    }
}
