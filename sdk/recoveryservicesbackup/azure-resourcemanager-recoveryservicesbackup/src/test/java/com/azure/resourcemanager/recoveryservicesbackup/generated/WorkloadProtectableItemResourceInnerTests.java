// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.WorkloadProtectableItemResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.WorkloadProtectableItem;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class WorkloadProtectableItemResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadProtectableItemResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"protectableItemType\":\"WorkloadProtectableItem\",\"backupManagementType\":\"pikpz\",\"workloadType\":\"ejzanlfz\",\"friendlyName\":\"av\",\"protectionState\":\"Protected\"},\"eTag\":\"onok\",\"location\":\"xrjqcirgzpfrlazs\",\"tags\":{\"wp\":\"woiindf\",\"jvfbgofelja\":\"ylwbtlhflsjcdhsz\"},\"id\":\"rqmq\",\"name\":\"ldvriiiojnalghfk\",\"type\":\"tvsexsowuel\"}")
                .toObject(WorkloadProtectableItemResourceInner.class);
        Assertions.assertEquals("xrjqcirgzpfrlazs", model.location());
        Assertions.assertEquals("woiindf", model.tags().get("wp"));
        Assertions.assertEquals("pikpz", model.properties().backupManagementType());
        Assertions.assertEquals("ejzanlfz", model.properties().workloadType());
        Assertions.assertEquals("av", model.properties().friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTED, model.properties().protectionState());
        Assertions.assertEquals("onok", model.etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadProtectableItemResourceInner model =
            new WorkloadProtectableItemResourceInner()
                .withLocation("xrjqcirgzpfrlazs")
                .withTags(mapOf("wp", "woiindf", "jvfbgofelja", "ylwbtlhflsjcdhsz"))
                .withProperties(
                    new WorkloadProtectableItem()
                        .withBackupManagementType("pikpz")
                        .withWorkloadType("ejzanlfz")
                        .withFriendlyName("av")
                        .withProtectionState(ProtectionStatus.PROTECTED))
                .withEtag("onok");
        model = BinaryData.fromObject(model).toObject(WorkloadProtectableItemResourceInner.class);
        Assertions.assertEquals("xrjqcirgzpfrlazs", model.location());
        Assertions.assertEquals("woiindf", model.tags().get("wp"));
        Assertions.assertEquals("pikpz", model.properties().backupManagementType());
        Assertions.assertEquals("ejzanlfz", model.properties().workloadType());
        Assertions.assertEquals("av", model.properties().friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTED, model.properties().protectionState());
        Assertions.assertEquals("onok", model.etag());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
