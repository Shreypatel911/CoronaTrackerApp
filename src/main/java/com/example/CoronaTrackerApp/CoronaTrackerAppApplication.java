package com.example.CoronaTrackerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronaTrackerAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(CoronaTrackerAppApplication.class, args);
	}

}
