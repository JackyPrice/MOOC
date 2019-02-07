package com.JJGS.HackDay.services;

import com.JJGS.HackDay.model.Crime;
import com.JJGS.HackDay.model.CrimeAllStats;
import com.JJGS.HackDay.model.CrimeStats;

import java.io.IOException;
import java.util.ArrayList;

public interface CrimeStatsService {
    CrimeAllStats getAllCrimes(String pathname)throws IOException;
    CrimeStats getRelevantCrimes(String pathname)throws IOException;
}