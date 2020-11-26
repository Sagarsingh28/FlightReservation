package com.akku.Flight.myService;

import java.util.Date;
import java.util.List;

import com.akku.Flight.entities.Flight;

public interface FlightService {

	List<Flight> findFlights(String from,String to, Date departureDate);
	Flight findFlightById(long id);
}
