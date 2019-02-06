package com.crimestats.controller;

import com.crimestats.model.Crime;
import com.crimestats.model.LatLongPair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
public class CrimeStatsController {
    private static final String BASE_URL = "https://data.police.uk/api/";
    private RestTemplate restTemplate;

    @Autowired
    public CrimeStatsController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/getCrimeForLocation")
    public void getCrimeForLatLong(){
        String url = BASE_URL + "crimes-street/all-crime";
        String poly = "poly=" + getPolyForArea();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.valueOf(MediaType.APPLICATION_FORM_URLENCODED_VALUE));
        HttpEntity<String> request = new HttpEntity<>(poly, headers);

        ResponseEntity<Crime[]> crimeResponse = restTemplate.postForEntity(url, request, Crime[].class);

        Arrays.stream(crimeResponse.getBody()).forEach(System.out::println);
    }

    private String getPolyForArea() {
        String area = "greater-manchester";
        String id = "AC02";
        String url = BASE_URL + area + "/" + id + "/boundary";
        ResponseEntity<LatLongPair[]> response = restTemplate.getForEntity(url, LatLongPair[].class);
        StringBuilder poly = new StringBuilder();
        for(LatLongPair latLongPair : response.getBody()) {
            poly.append(latLongPair.getLatitude()).append(",").append(latLongPair.getLongitude()).append(":");
        }
        poly.deleteCharAt(poly.length()-1);
        return poly.toString();
    }
}
