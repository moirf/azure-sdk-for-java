// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** NFV version of Routing Configuration indicating the associated and propagated route tables for this connection. */
@Fluent
public final class RoutingConfigurationNfv {
    /*
     * The resource id RouteTable associated with this RoutingConfiguration.
     */
    @JsonProperty(value = "associatedRouteTable")
    private RoutingConfigurationNfvSubResource associatedRouteTable;

    /*
     * The list of RouteTables to advertise the routes to.
     */
    @JsonProperty(value = "propagatedRouteTables")
    private PropagatedRouteTableNfv propagatedRouteTables;

    /*
     * The resource id of the RouteMap associated with this RoutingConfiguration for inbound learned routes.
     */
    @JsonProperty(value = "inboundRouteMap")
    private RoutingConfigurationNfvSubResource inboundRouteMap;

    /*
     * The resource id of the RouteMap associated with this RoutingConfiguration for outbound advertised routes.
     */
    @JsonProperty(value = "outboundRouteMap")
    private RoutingConfigurationNfvSubResource outboundRouteMap;

    /** Creates an instance of RoutingConfigurationNfv class. */
    public RoutingConfigurationNfv() {
    }

    /**
     * Get the associatedRouteTable property: The resource id RouteTable associated with this RoutingConfiguration.
     *
     * @return the associatedRouteTable value.
     */
    public RoutingConfigurationNfvSubResource associatedRouteTable() {
        return this.associatedRouteTable;
    }

    /**
     * Set the associatedRouteTable property: The resource id RouteTable associated with this RoutingConfiguration.
     *
     * @param associatedRouteTable the associatedRouteTable value to set.
     * @return the RoutingConfigurationNfv object itself.
     */
    public RoutingConfigurationNfv withAssociatedRouteTable(RoutingConfigurationNfvSubResource associatedRouteTable) {
        this.associatedRouteTable = associatedRouteTable;
        return this;
    }

    /**
     * Get the propagatedRouteTables property: The list of RouteTables to advertise the routes to.
     *
     * @return the propagatedRouteTables value.
     */
    public PropagatedRouteTableNfv propagatedRouteTables() {
        return this.propagatedRouteTables;
    }

    /**
     * Set the propagatedRouteTables property: The list of RouteTables to advertise the routes to.
     *
     * @param propagatedRouteTables the propagatedRouteTables value to set.
     * @return the RoutingConfigurationNfv object itself.
     */
    public RoutingConfigurationNfv withPropagatedRouteTables(PropagatedRouteTableNfv propagatedRouteTables) {
        this.propagatedRouteTables = propagatedRouteTables;
        return this;
    }

    /**
     * Get the inboundRouteMap property: The resource id of the RouteMap associated with this RoutingConfiguration for
     * inbound learned routes.
     *
     * @return the inboundRouteMap value.
     */
    public RoutingConfigurationNfvSubResource inboundRouteMap() {
        return this.inboundRouteMap;
    }

    /**
     * Set the inboundRouteMap property: The resource id of the RouteMap associated with this RoutingConfiguration for
     * inbound learned routes.
     *
     * @param inboundRouteMap the inboundRouteMap value to set.
     * @return the RoutingConfigurationNfv object itself.
     */
    public RoutingConfigurationNfv withInboundRouteMap(RoutingConfigurationNfvSubResource inboundRouteMap) {
        this.inboundRouteMap = inboundRouteMap;
        return this;
    }

    /**
     * Get the outboundRouteMap property: The resource id of the RouteMap associated with this RoutingConfiguration for
     * outbound advertised routes.
     *
     * @return the outboundRouteMap value.
     */
    public RoutingConfigurationNfvSubResource outboundRouteMap() {
        return this.outboundRouteMap;
    }

    /**
     * Set the outboundRouteMap property: The resource id of the RouteMap associated with this RoutingConfiguration for
     * outbound advertised routes.
     *
     * @param outboundRouteMap the outboundRouteMap value to set.
     * @return the RoutingConfigurationNfv object itself.
     */
    public RoutingConfigurationNfv withOutboundRouteMap(RoutingConfigurationNfvSubResource outboundRouteMap) {
        this.outboundRouteMap = outboundRouteMap;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (associatedRouteTable() != null) {
            associatedRouteTable().validate();
        }
        if (propagatedRouteTables() != null) {
            propagatedRouteTables().validate();
        }
        if (inboundRouteMap() != null) {
            inboundRouteMap().validate();
        }
        if (outboundRouteMap() != null) {
            outboundRouteMap().validate();
        }
    }
}
