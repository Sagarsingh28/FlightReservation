package com.akku.Flight.myDAL;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akku.Flight.entities.Passenger;

public interface PassengerDAL extends JpaRepository<Passenger,Long>{
}
