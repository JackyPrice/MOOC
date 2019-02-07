package com.JJGS.HackDay.model;

import java.util.ArrayList;

public class CrimeAllStats {
    private ArrayList<Crime> crimeAllStats;
    public CrimeAllStats(){
        this.crimeAllStats = new ArrayList<Crime>();
    }

    public void add(String crime_id,  String month,  String reported_by,  String falls_within,  String longitude,  String latitude,  String location,  String lsoa_code,  String lsoa_name,  String crime_type,  String last_outcome_category,  String context){
        crimeAllStats.add(new Crime(crime_id,  month,  reported_by,  falls_within,  longitude,  latitude,  location,  lsoa_code,  lsoa_name,  crime_type,  last_outcome_category,  context));
    }
    
    public void printAllCrimes(){
        
        for(Crime crime : crimeAllStats){
            System.out.println(
                    "Crime ID: " + crime.getCrime_id() +
                    " Month: " + crime.getMonth() +
                    " Reported by " + crime.getReported_by() +
                    " Falls within: " +  crime.getFalls_within() +
                    " Longitude: " + crime.getLongitude() +
                    " Latitude: " + crime.getLatitude() +
                    " Location: " + crime.getLocation() +
                    " Lsoa code: " + crime.getLsoa_code() +
                    " Lsoa name: " + crime.getLsoa_name() +
                    " Crime type: " + crime.getCrime_type() +
                    " Last outcome category: " + crime.getLast_outcome_category() +
                    " context: " + crime.getContext());
        }
            
            
    }
    
    public void filterByMonth(){}
    public void filterByCrimeType(){}
}
