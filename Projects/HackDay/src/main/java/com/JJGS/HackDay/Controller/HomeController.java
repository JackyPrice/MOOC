package com.JJGS.HackDay.Controller;

import com.JJGS.HackDay.model.CrimeStats;
import com.JJGS.HackDay.services.CrimeStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

    @Controller
public class HomeController {


        @Autowired
        private CrimeStatsService crimeStatsService;

        @RequestMapping("/")
        public String index(Model model) throws IOException {
//            List<Post> latest3Posts = latest5Posts.stream().limit(3).collect(Collectors.toList());
//            model.addAttribute("latest3posts", latest3Posts);

            CrimeStats listOfCrimes = crimeStatsService.getRelevantCrimes("/Users/priceja/Projects/HackDay/src/main/resources/csv2018/CrimeData.csv");
            model.addAttribute("crimeList",listOfCrimes);
            return "index";
        }
    }


