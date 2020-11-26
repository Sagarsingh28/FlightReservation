package com.akku.Flight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class FlightReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightReservationApplication.class, args);
	}

}
