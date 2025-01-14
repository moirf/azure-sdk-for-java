// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Sets the frequency at which a snapshot of the database is created. */
public final class RdbFrequency extends ExpandableStringEnum<RdbFrequency> {
    /** Static value 1h for RdbFrequency. */
    public static final RdbFrequency ONEH = fromString("1h");

    /** Static value 6h for RdbFrequency. */
    public static final RdbFrequency SIXH = fromString("6h");

    /** Static value 12h for RdbFrequency. */
    public static final RdbFrequency ONE_TWOH = fromString("12h");

    /**
     * Creates a new instance of RdbFrequency value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RdbFrequency() {
    }

    /**
     * Creates or finds a RdbFrequency from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RdbFrequency.
     */
    @JsonCreator
    public static RdbFrequency fromString(String name) {
        return fromString(name, RdbFrequency.class);
    }

    /**
     * Gets known RdbFrequency values.
     *
     * @return known RdbFrequency values.
     */
    public static Collection<RdbFrequency> values() {
        return values(RdbFrequency.class);
    }
}
