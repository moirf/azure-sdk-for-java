// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.DatabasePrincipalInner;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalRole;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalType;
import org.junit.jupiter.api.Assertions;

public final class DatabasePrincipalInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabasePrincipalInner model =
            BinaryData
                .fromString(
                    "{\"role\":\"Monitor\",\"name\":\"fxobbcsws\",\"type\":\"App\",\"fqn\":\"riplrbpbewtg\",\"email\":\"gblcgwxzvlvq\",\"appId\":\"kbegibt\",\"tenantName\":\"xiebwwaloayqcg\"}")
                .toObject(DatabasePrincipalInner.class);
        Assertions.assertEquals(DatabasePrincipalRole.MONITOR, model.role());
        Assertions.assertEquals("fxobbcsws", model.name());
        Assertions.assertEquals(DatabasePrincipalType.APP, model.type());
        Assertions.assertEquals("riplrbpbewtg", model.fqn());
        Assertions.assertEquals("gblcgwxzvlvq", model.email());
        Assertions.assertEquals("kbegibt", model.appId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabasePrincipalInner model =
            new DatabasePrincipalInner()
                .withRole(DatabasePrincipalRole.MONITOR)
                .withName("fxobbcsws")
                .withType(DatabasePrincipalType.APP)
                .withFqn("riplrbpbewtg")
                .withEmail("gblcgwxzvlvq")
                .withAppId("kbegibt");
        model = BinaryData.fromObject(model).toObject(DatabasePrincipalInner.class);
        Assertions.assertEquals(DatabasePrincipalRole.MONITOR, model.role());
        Assertions.assertEquals("fxobbcsws", model.name());
        Assertions.assertEquals(DatabasePrincipalType.APP, model.type());
        Assertions.assertEquals("riplrbpbewtg", model.fqn());
        Assertions.assertEquals("gblcgwxzvlvq", model.email());
        Assertions.assertEquals("kbegibt", model.appId());
    }
}
