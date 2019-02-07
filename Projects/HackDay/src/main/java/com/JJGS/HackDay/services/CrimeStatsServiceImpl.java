package com.JJGS.HackDay.services;

import com.JJGS.HackDay.model.CrimeAllStats;
import com.JJGS.HackDay.model.CrimeStats;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

@Service
public class CrimeStatsServiceImpl implements CrimeStatsService {

    @Override
    public CrimeAllStats getAllCrimes(String pathname) throws IOException {
        CrimeAllStats crimeAllStats = new CrimeAllStats();
        Reader in = new FileReader(pathname);
        Iterable<CSVRecord> records = CSVFormat.DEFAULT
                .withFirstRecordAsHeader()
                .parse(in);
        for (CSVRecord record : records) {
            String crime_ID = record.get("Crime ID");
            String month = record.get("Month");
            String reported_by = record.get("Reported by");
            String falls_within = record.get("Falls within");
            String longitude = record.get("Longitude");
            String latitude = record.get("Latitude");
            String location = record.get("Location");
            String lsoa_code = record.get("LSOA code");
            String lsoa_name = record.get("LSOA name");
            String crime_type = record.get("Crime type");
            String last_outcome_category = record.get("Last outcome category");
            String context = record.get("Context");

            crimeAllStats.add(crime_ID,month,reported_by,falls_within,longitude,latitude,location,lsoa_code,lsoa_name,crime_type,last_outcome_category,context);

            crimeAllStats.printAllCrimes();


//            Crime ID,Month,Reported by,Falls within,Longitude,Latitude,Location,LSOA code,LSOA name,Crime type,Last outcome category,Context


//            System.out.println("CSV FILE LOADER: " + "Crime ID: " + crime_ID + " Month: " + month + " Reported by " + reported_by
//                    + " Falls within: " +  falls_within + " Longitude: " + longitude + " Latitude: " + latitude +
//                    " Location: " + location + " Lsoa code: " + lsoa_code + " Lsoa name: " + lsoa_name + " Crime type: " + crime_type + " Last outcome category: " + last_outcome_category + " context: " + context);
        }
            return crimeAllStats;
    }

    @Override
    public CrimeStats getRelevantCrimes(String pathname) throws IOException {
        CrimeStats crimeStats = new CrimeStats();
        Reader in = new FileReader(pathname);
        Iterable<CSVRecord> records = CSVFormat.DEFAULT
                .withFirstRecordAsHeader()
                .parse(in);
        int count=0;
        for (CSVRecord record : records) {

            String month = record.get("Month");
            String longitude = record.get("Longitude");
            String latitude = record.get("Latitude");
            String crime_type = record.get("Crime type");
            String last_outcome_category = record.get("Last outcome category");



            if(!month.isEmpty() || !month.equals(null) || month!="" || month != null) {
                crimeStats.add(month, longitude, latitude, crime_type, last_outcome_category);
                count++;
            }



//            crimeStats.printAllCrimes();

//            Crime ID,Month,Reported by,Falls within,Longitude,Latitude,Location,LSOA code,LSOA name,Crime type,Last outcome category,Context


//            System.out.println("CSV FILE LOADER: " + "Crime ID: " + crime_ID + " Month: " + month + " Reported by " + reported_by
//                    + " Falls within: " +  falls_within + " Longitude: " + longitude + " Latitude: " + latitude +
//                    " Location: " + location + " Lsoa code: " + lsoa_code + " Lsoa name: " + lsoa_name + " Crime type: " + crime_type + " Last outcome category: " + last_outcome_category + " context: " + context);
        }
        System.out.println("THIS IS THE COUNT: " +count);
            return crimeStats;
    }

}
