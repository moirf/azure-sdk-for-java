// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.IotHubSku;
import com.azure.resourcemanager.iothub.models.IotHubSkuInfo;
import org.junit.jupiter.api.Assertions;

public final class IotHubSkuInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IotHubSkuInfo model =
            BinaryData
                .fromString("{\"name\":\"F1\",\"tier\":\"Free\",\"capacity\":6629328138871723809}")
                .toObject(IotHubSkuInfo.class);
        Assertions.assertEquals(IotHubSku.F1, model.name());
        Assertions.assertEquals(6629328138871723809L, model.capacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IotHubSkuInfo model = new IotHubSkuInfo().withName(IotHubSku.F1).withCapacity(6629328138871723809L);
        model = BinaryData.fromObject(model).toObject(IotHubSkuInfo.class);
        Assertions.assertEquals(IotHubSku.F1, model.name());
        Assertions.assertEquals(6629328138871723809L, model.capacity());
    }
}
