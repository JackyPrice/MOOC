package com.crimestats.model;

import lombok.Data;

@Data
public class Location {
    private String latitude;
    private String longitude;
    private Street street;
}
