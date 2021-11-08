// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.containerregistry.fluent.models.ImportPipelineInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ImportPipelinesClient. */
public interface ImportPipelinesClient {
    /**
     * Gets the properties of the import pipeline.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param importPipelineName The name of the import pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the import pipeline.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ImportPipelineInner>> getWithResponseAsync(
        String resourceGroupName, String registryName, String importPipelineName);

    /**
     * Gets the properties of the import pipeline.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param importPipelineName The name of the import pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the import pipeline.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ImportPipelineInner> getAsync(String resourceGroupName, String registryName, String importPipelineName);

    /**
     * Gets the properties of the import pipeline.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param importPipelineName The name of the import pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the import pipeline.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ImportPipelineInner get(String resourceGroupName, String registryName, String importPipelineName);

    /**
     * Gets the properties of the import pipeline.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param importPipelineName The name of the import pipeline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the import pipeline.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ImportPipelineInner> getWithResponse(
        String resourceGroupName, String registryName, String importPipelineName, Context context);

    /**
     * Creates an import pipeline for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param importPipelineName The name of the import pipeline.
     * @param importPipelineCreateParameters The parameters for creating an import pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents an import pipeline for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(
        String resourceGroupName,
        String registryName,
        String importPipelineName,
        ImportPipelineInner importPipelineCreateParameters);

    /**
     * Creates an import pipeline for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param importPipelineName The name of the import pipeline.
     * @param importPipelineCreateParameters The parameters for creating an import pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents an import pipeline for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<ImportPipelineInner>, ImportPipelineInner> beginCreateAsync(
        String resourceGroupName,
        String registryName,
        String importPipelineName,
        ImportPipelineInner importPipelineCreateParameters);

    /**
     * Creates an import pipeline for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param importPipelineName The name of the import pipeline.
     * @param importPipelineCreateParameters The parameters for creating an import pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents an import pipeline for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ImportPipelineInner>, ImportPipelineInner> beginCreate(
        String resourceGroupName,
        String registryName,
        String importPipelineName,
        ImportPipelineInner importPipelineCreateParameters);

    /**
     * Creates an import pipeline for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param importPipelineName The name of the import pipeline.
     * @param importPipelineCreateParameters The parameters for creating an import pipeline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents an import pipeline for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ImportPipelineInner>, ImportPipelineInner> beginCreate(
        String resourceGroupName,
        String registryName,
        String importPipelineName,
        ImportPipelineInner importPipelineCreateParameters,
        Context context);

    /**
     * Creates an import pipeline for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param importPipelineName The name of the import pipeline.
     * @param importPipelineCreateParameters The parameters for creating an import pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents an import pipeline for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ImportPipelineInner> createAsync(
        String resourceGroupName,
        String registryName,
        String importPipelineName,
        ImportPipelineInner importPipelineCreateParameters);

    /**
     * Creates an import pipeline for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param importPipelineName The name of the import pipeline.
     * @param importPipelineCreateParameters The parameters for creating an import pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents an import pipeline for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ImportPipelineInner create(
        String resourceGroupName,
        String registryName,
        String importPipelineName,
        ImportPipelineInner importPipelineCreateParameters);

    /**
     * Creates an import pipeline for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param importPipelineName The name of the import pipeline.
     * @param importPipelineCreateParameters The parameters for creating an import pipeline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents an import pipeline for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ImportPipelineInner create(
        String resourceGroupName,
        String registryName,
        String importPipelineName,
        ImportPipelineInner importPipelineCreateParameters,
        Context context);

    /**
     * Deletes an import pipeline from a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param importPipelineName The name of the import pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String registryName, String importPipelineName);

    /**
     * Deletes an import pipeline from a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param importPipelineName The name of the import pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String registryName, String importPipelineName);

    /**
     * Deletes an import pipeline from a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param importPipelineName The name of the import pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String registryName, String importPipelineName);

    /**
     * Deletes an import pipeline from a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param importPipelineName The name of the import pipeline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String registryName, String importPipelineName, Context context);

    /**
     * Deletes an import pipeline from a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param importPipelineName The name of the import pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String registryName, String importPipelineName);

    /**
     * Deletes an import pipeline from a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param importPipelineName The name of the import pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String registryName, String importPipelineName);

    /**
     * Deletes an import pipeline from a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param importPipelineName The name of the import pipeline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String registryName, String importPipelineName, Context context);

    /**
     * Lists all import pipelines for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list import pipelines for a container registry.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ImportPipelineInner> listAsync(String resourceGroupName, String registryName);

    /**
     * Lists all import pipelines for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list import pipelines for a container registry.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ImportPipelineInner> list(String resourceGroupName, String registryName);

    /**
     * Lists all import pipelines for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list import pipelines for a container registry.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ImportPipelineInner> list(String resourceGroupName, String registryName, Context context);
}