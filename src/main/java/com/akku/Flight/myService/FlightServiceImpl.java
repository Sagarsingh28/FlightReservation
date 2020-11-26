package com.akku.Flight.myService;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akku.Flight.entities.Flight;
import com.akku.Flight.myDAL.FlightDAL;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightDAL flightDal;
	
	@Override
	public List<Flight> findFlights(String from, String to, Date departureDate) {
		List<Flight> flights = flightDal.findFlights(from,to,departureDate);
		return flights;
	}

	@Override
	public Flight findFlightById(long id) {
		Flight flight = flightDal.findById(id).get();
		return flight;
	}

}
