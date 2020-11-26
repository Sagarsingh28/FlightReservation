package com.akku.Flight.myController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.akku.Flight.dataTransferObject.ReservationRequest;
import com.akku.Flight.entities.Reservation;
import com.akku.Flight.myService.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	private ReservationService reservationService;
	
	@PostMapping("/passengerReservation")
	public String passengerReservation(ReservationRequest request,Model model) {
		Reservation reserve = reservationService.bookFlight(request);
		model.addAttribute("info", reserve);
		model.addAttribute("info2", request);
		return "booking/seatBookedPage";
	}
	
	@GetMapping("/homePage")
	public String homePage() {
		return "homePage";
	}
}
