// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceupdate.models.ConnectionDetails;
import org.junit.jupiter.api.Test;

public final class ConnectionDetailsTests {
    @Test
    public void testDeserialize() {
        ConnectionDetails model =
            BinaryData
                .fromString(
                    "{\"id\":\"lcgwxzvlvqh\",\"privateIpAddress\":\"begibtnmxiebwwa\",\"linkIdentifier\":\"ayqcgw\",\"groupId\":\"zjuzgwyz\",\"memberName\":\"txon\"}")
                .toObject(ConnectionDetails.class);
    }

    @Test
    public void testSerialize() {
        ConnectionDetails model = new ConnectionDetails();
        model = BinaryData.fromObject(model).toObject(ConnectionDetails.class);
    }
}
