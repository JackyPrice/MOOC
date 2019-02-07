package com.JJGS.HackDay;

//import com.JJGS.HackDay.fileupload.CSVfileUpload;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class HackDayApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(HackDayApplication.class, args);

//		CSVfileUpload csvFileLoader = new CSVfileUpload("/Users/priceja/Projects/HackDay/src/main/resources/csv2018/CrimeData.csv");

	}


}

