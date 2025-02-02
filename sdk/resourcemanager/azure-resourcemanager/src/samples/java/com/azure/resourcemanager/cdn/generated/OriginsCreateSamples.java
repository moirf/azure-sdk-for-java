// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.fluent.models.OriginInner;

/** Samples for Origins Create. */
public final class OriginsCreateSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2021-06-01/examples/Origins_Create.json
     */
    /**
     * Sample code: Origins_Create.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void originsCreate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getOrigins()
            .create(
                "RG",
                "profile1",
                "endpoint1",
                "www-someDomain-net",
                new OriginInner()
                    .withHostname("www.someDomain.net")
                    .withHttpPort(80)
                    .withHttpsPort(443)
                    .withOriginHostHeader("www.someDomain.net")
                    .withPriority(1)
                    .withWeight(50)
                    .withEnabled(true)
                    .withPrivateLinkResourceId(
                        "/subscriptions/subid/resourcegroups/rg1/providers/Microsoft.Network/privateLinkServices/pls1")
                    .withPrivateLinkLocation("eastus")
                    .withPrivateLinkApprovalMessage("Please approve the connection request for this Private Link"),
                Context.NONE);
    }
}
