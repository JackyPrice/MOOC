package com.JJGS.HackDay.model;

import java.util.ArrayList;

public class CrimeStats {

        private ArrayList<Crime> crimeStats;
        public CrimeStats(){
            this.crimeStats = new ArrayList<Crime>();
        }

        public void add(String month,  String longitude,  String latitude,  String crime_type,  String last_outcome_category){
            crimeStats.add(new Crime(month,  longitude,  latitude,  crime_type,  last_outcome_category));
        }

        public void printAllCrimes(){

            for(Crime crime : crimeStats){
                System.out.println(
                                " Month: " + crime.getMonth() +
                                " Longitude: " + crime.getLongitude() +
                                " Latitude: " + crime.getLatitude() +
                                " Crime type: " + crime.getCrime_type() +
                                " Last outcome category: " + crime.getLast_outcome_category());
            }


        }

        public ArrayList<Crime> getCrimes(){
            return this.crimeStats;
        }



        public void filterByMonth(){}
        public void filterByCrimeType(){}
    }

