// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Kind. */
public final class Kind extends ExpandableStringEnum<Kind> {
    /** Static value Live for Kind. */
    public static final Kind LIVE = fromString("Live");

    /** Static value Batch for Kind. */
    public static final Kind BATCH = fromString("Batch");

    /**
     * Creates or finds a Kind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Kind.
     */
    @JsonCreator
    public static Kind fromString(String name) {
        return fromString(name, Kind.class);
    }

    /** @return known Kind values. */
    public static Collection<Kind> values() {
        return values(Kind.class);
    }
}