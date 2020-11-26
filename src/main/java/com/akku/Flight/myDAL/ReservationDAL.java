package com.akku.Flight.myDAL;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akku.Flight.entities.Reservation;

public interface ReservationDAL extends JpaRepository<Reservation,Long>{
}
