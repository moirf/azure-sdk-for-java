// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Http logs to file system configuration. */
@Fluent
public final class FileSystemHttpLogsConfig {
    /*
     * Maximum size in megabytes that http log files can use.
     * When reached old log files will be removed to make space for new ones.
     * Value can range between 25 and 100.
     */
    @JsonProperty(value = "retentionInMb")
    private Integer retentionInMb;

    /*
     * Retention in days.
     * Remove files older than X days.
     * 0 or lower means no retention.
     */
    @JsonProperty(value = "retentionInDays")
    private Integer retentionInDays;

    /*
     * True if configuration is enabled, false if it is disabled and null if configuration is not set.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /** Creates an instance of FileSystemHttpLogsConfig class. */
    public FileSystemHttpLogsConfig() {
    }

    /**
     * Get the retentionInMb property: Maximum size in megabytes that http log files can use. When reached old log files
     * will be removed to make space for new ones. Value can range between 25 and 100.
     *
     * @return the retentionInMb value.
     */
    public Integer retentionInMb() {
        return this.retentionInMb;
    }

    /**
     * Set the retentionInMb property: Maximum size in megabytes that http log files can use. When reached old log files
     * will be removed to make space for new ones. Value can range between 25 and 100.
     *
     * @param retentionInMb the retentionInMb value to set.
     * @return the FileSystemHttpLogsConfig object itself.
     */
    public FileSystemHttpLogsConfig withRetentionInMb(Integer retentionInMb) {
        this.retentionInMb = retentionInMb;
        return this;
    }

    /**
     * Get the retentionInDays property: Retention in days. Remove files older than X days. 0 or lower means no
     * retention.
     *
     * @return the retentionInDays value.
     */
    public Integer retentionInDays() {
        return this.retentionInDays;
    }

    /**
     * Set the retentionInDays property: Retention in days. Remove files older than X days. 0 or lower means no
     * retention.
     *
     * @param retentionInDays the retentionInDays value to set.
     * @return the FileSystemHttpLogsConfig object itself.
     */
    public FileSystemHttpLogsConfig withRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
        return this;
    }

    /**
     * Get the enabled property: True if configuration is enabled, false if it is disabled and null if configuration is
     * not set.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: True if configuration is enabled, false if it is disabled and null if configuration is
     * not set.
     *
     * @param enabled the enabled value to set.
     * @return the FileSystemHttpLogsConfig object itself.
     */
    public FileSystemHttpLogsConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
