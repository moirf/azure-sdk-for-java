// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of HybridAksClusters. */
public interface HybridAksClusters {
    /**
     * List additional details related to Hybrid AKS provisioned clusters in the subscription.
     *
     * <p>Get a list of additional details related to Hybrid AKS provisioned clusters in the provided subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of additional details related to Hybrid AKS provisioned clusters in the provided subscription as
     *     paginated response with {@link PagedIterable}.
     */
    PagedIterable<HybridAksCluster> list();

    /**
     * List additional details related to Hybrid AKS provisioned clusters in the subscription.
     *
     * <p>Get a list of additional details related to Hybrid AKS provisioned clusters in the provided subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of additional details related to Hybrid AKS provisioned clusters in the provided subscription as
     *     paginated response with {@link PagedIterable}.
     */
    PagedIterable<HybridAksCluster> list(Context context);

    /**
     * List additional details related to Hybrid AKS provisioned clusters in the resource group.
     *
     * <p>Get a list of additional details for Hybrid AKS provisioned clusters in the provided resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of additional details for Hybrid AKS provisioned clusters in the provided resource group as
     *     paginated response with {@link PagedIterable}.
     */
    PagedIterable<HybridAksCluster> listByResourceGroup(String resourceGroupName);

    /**
     * List additional details related to Hybrid AKS provisioned clusters in the resource group.
     *
     * <p>Get a list of additional details for Hybrid AKS provisioned clusters in the provided resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of additional details for Hybrid AKS provisioned clusters in the provided resource group as
     *     paginated response with {@link PagedIterable}.
     */
    PagedIterable<HybridAksCluster> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieve the additional details related to the Hybrid AKS provisioned cluster.
     *
     * <p>Get the additional details related to the provided Hybrid AKS provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hybridAksClusterName The name of the Hybrid AKS cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the additional details related to the provided Hybrid AKS provisioned cluster along with {@link
     *     Response}.
     */
    Response<HybridAksCluster> getByResourceGroupWithResponse(
        String resourceGroupName, String hybridAksClusterName, Context context);

    /**
     * Retrieve the additional details related to the Hybrid AKS provisioned cluster.
     *
     * <p>Get the additional details related to the provided Hybrid AKS provisioned cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hybridAksClusterName The name of the Hybrid AKS cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the additional details related to the provided Hybrid AKS provisioned cluster.
     */
    HybridAksCluster getByResourceGroup(String resourceGroupName, String hybridAksClusterName);

    /**
     * Delete the additional details related to the Hybrid AKS provisioned cluster.
     *
     * <p>Delete the additional details related to the provided Hybrid AKS provisioned cluster. All customer initiated
     * requests will be rejected as the life cycle of this resource is managed by the system.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hybridAksClusterName The name of the Hybrid AKS cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String hybridAksClusterName);

    /**
     * Delete the additional details related to the Hybrid AKS provisioned cluster.
     *
     * <p>Delete the additional details related to the provided Hybrid AKS provisioned cluster. All customer initiated
     * requests will be rejected as the life cycle of this resource is managed by the system.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hybridAksClusterName The name of the Hybrid AKS cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String hybridAksClusterName, Context context);

    /**
     * Restart a targeted node.
     *
     * <p>Restart a targeted node of a Hybrid AKS cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hybridAksClusterName The name of the Hybrid AKS cluster.
     * @param hybridAksClusterRestartNodeParameters The request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restartNode(
        String resourceGroupName,
        String hybridAksClusterName,
        HybridAksClusterRestartNodeParameters hybridAksClusterRestartNodeParameters);

    /**
     * Restart a targeted node.
     *
     * <p>Restart a targeted node of a Hybrid AKS cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hybridAksClusterName The name of the Hybrid AKS cluster.
     * @param hybridAksClusterRestartNodeParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restartNode(
        String resourceGroupName,
        String hybridAksClusterName,
        HybridAksClusterRestartNodeParameters hybridAksClusterRestartNodeParameters,
        Context context);

    /**
     * Retrieve the additional details related to the Hybrid AKS provisioned cluster.
     *
     * <p>Get the additional details related to the provided Hybrid AKS provisioned cluster.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the additional details related to the provided Hybrid AKS provisioned cluster along with {@link
     *     Response}.
     */
    HybridAksCluster getById(String id);

    /**
     * Retrieve the additional details related to the Hybrid AKS provisioned cluster.
     *
     * <p>Get the additional details related to the provided Hybrid AKS provisioned cluster.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the additional details related to the provided Hybrid AKS provisioned cluster along with {@link
     *     Response}.
     */
    Response<HybridAksCluster> getByIdWithResponse(String id, Context context);

    /**
     * Delete the additional details related to the Hybrid AKS provisioned cluster.
     *
     * <p>Delete the additional details related to the provided Hybrid AKS provisioned cluster. All customer initiated
     * requests will be rejected as the life cycle of this resource is managed by the system.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete the additional details related to the Hybrid AKS provisioned cluster.
     *
     * <p>Delete the additional details related to the provided Hybrid AKS provisioned cluster. All customer initiated
     * requests will be rejected as the life cycle of this resource is managed by the system.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new HybridAksCluster resource.
     *
     * @param name resource name.
     * @return the first stage of the new HybridAksCluster definition.
     */
    HybridAksCluster.DefinitionStages.Blank define(String name);
}
