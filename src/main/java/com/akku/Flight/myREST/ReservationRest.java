package com.akku.Flight.myREST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akku.Flight.dataTransferObject.UpdateReserved;
import com.akku.Flight.entities.Reservation;
import com.akku.Flight.myDAL.ReservationDAL;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ReservationRest {

	@Autowired
	private ReservationDAL reservationDal;
	
	@GetMapping("/reservation/{id}")
	public Reservation getReservedPassenger(@PathVariable("id") long id) {
		Reservation reserved = reservationDal.findById(id).get();
		return reserved;
	}
	
	@PostMapping("/reservation")
	public Reservation updateReservedPassenger(@RequestBody UpdateReserved update) {
		Reservation reserved = reservationDal.findById(update.getId()).get();
		reserved.setCheckedIn(update.isCheckedIn());
		reserved.setNoOfBags(update.getNoOfBags());
		Reservation updatedReservation = reservationDal.save(reserved);
		return updatedReservation;
	}
}
