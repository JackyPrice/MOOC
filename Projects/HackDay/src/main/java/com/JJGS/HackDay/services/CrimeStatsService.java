package com.JJGS.HackDay.services;

import com.JJGS.HackDay.model.Crime;
import com.JJGS.HackDay.model.CrimeStats;

import java.io.IOException;
import java.util.ArrayList;

public interface CrimeStatsService {
    CrimeStats getCrimes(String pathname)throws IOException;
}