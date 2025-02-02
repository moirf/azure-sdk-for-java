// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Collection;

/**
 * Defines values for {@link WarningCode}.
 */
@Immutable
public final class WarningCode extends ExpandableStringEnum<WarningCode> {
    /**
     * Static value LongWordsInDocument for {@link WarningCode}.
     */
    public static final WarningCode LONG_WORDS_IN_DOCUMENT = fromString("LongWordsInDocument");

    /**
     * Static value DocumentTruncated for {@link WarningCode}.
     */
    public static final WarningCode DOCUMENT_TRUNCATED = fromString("DocumentTruncated");

    /**
     * Creates or finds a {@link WarningCode} from its string representation.
     *
     * @param name A name to look for.
     * @return The corresponding {@link WarningCode}.
     */
    @JsonCreator
    public static WarningCode fromString(String name) {
        return fromString(name, WarningCode.class);
    }

    /** @return known WarningCode values. */
    public static Collection<WarningCode> values() {
        return values(WarningCode.class);
    }
}
