package com.JJGS.HackDay.model;

public class Crime {
    private String crime_id; 
    private String month; 
    private String reported_by; 
    private String falls_within; 
    private String longitude; 
    private String latitude; 
    private String location; 
    private String lsoa_code; 
    private String lsoa_name; 
    private String crime_type; 
    private String last_outcome_category;
    private String context;
    
    public Crime(String crime_id,  String month,  String reported_by,  String falls_within,  String longitude,  String latitude,  String location,  String lsoa_code,  String lsoa_name,  String crime_type,  String last_outcome_category,  String context){
        this.crime_id = crime_id;
        this.month = month;
        this.reported_by = reported_by;
        this.falls_within = falls_within;
        this.longitude =longitude;
        this.latitude = latitude;
        this.location = location;
        this.lsoa_code = lsoa_code;
        this.lsoa_name = lsoa_name;
        this.crime_type =crime_type;
        this.last_outcome_category =last_outcome_category;
        this.context = context;
    }

    public Crime(String month,  String longitude,  String latitude, String crime_type,  String last_outcome_category){
        this.month = month;
        this.longitude =longitude;
        this.latitude = latitude;
        this.crime_type =crime_type;
        this.last_outcome_category =last_outcome_category;

    }

    public String getCrime_id() {
        return crime_id;
    }

    public String getMonth() {
        return month;
    }

    public String getReported_by() {
        return reported_by;
    }

    public String getFalls_within() {
        return falls_within;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLocation() {
        return location;
    }

    public String getLsoa_code() {
        return lsoa_code;
    }

    public String getLsoa_name() {
        return lsoa_name;
    }

    public String getCrime_type() {
        return crime_type;
    }

    public String getLast_outcome_category() {
        return last_outcome_category;
    }

    public String getContext() {
        return context;
    }
}
