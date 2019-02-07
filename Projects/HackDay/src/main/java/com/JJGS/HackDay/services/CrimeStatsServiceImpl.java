package com.JJGS.HackDay.services;

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
    public CrimeStats getCrimes(String pathname) throws IOException {

        CrimeStats crimeStats = new CrimeStats();
        Reader in = new FileReader(pathname);
        Iterable<CSVRecord> records = CSVFormat.DEFAULT
                .withFirstRecordAsHeader()
                .parse(in);
        for (CSVRecord record : records) {

            String month = record.get("Month");
            String longitude = record.get("Longitude");
            String latitude = record.get("Latitude");
            String crime_type = record.get("Crime type");
            String last_outcome_category = record.get("Last outcome category");


            crimeStats.add(month, longitude, latitude, crime_type, last_outcome_category);

        }
            return crimeStats;
    }

}
