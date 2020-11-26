package com.akku.Flight.myDAL;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.akku.Flight.entities.Flight;

public interface FlightDAL extends JpaRepository<Flight,Long>{

	@Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture")
	List<Flight> findFlights(@Param("departureCity")String from, @Param("arrivalCity")String to, @Param("dateOfDeparture")Date departureDate);
}