package com.crimestats.model;

import lombok.Data;

import java.util.List;

@Data
public class CrimeResponse {
    private List<Crime> crimes;
}
