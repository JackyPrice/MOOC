package com.crimestats.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Crime {
    private String category;
    @JsonProperty("location_type")
    private String locationType;
    private Location location;
    private String context;
    @JsonProperty("outcome_status")
    private Outcome outcomeStatus;
    @JsonProperty("persistent_id")
    private String persistentId;
    private long id;
    @JsonProperty("location_subtype")
    private String locationSubtype;
    private String month;
}
