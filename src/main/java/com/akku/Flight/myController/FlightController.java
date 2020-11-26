package com.akku.Flight.myController;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.akku.Flight.entities.Flight;
import com.akku.Flight.myService.FlightService;

@Controller
public class FlightController {
	
//	@Autowired
//	private UserService userService;
	
	@Autowired
	private FlightService flightService;

	@PostMapping("/findFlights")
	public String findFlights(@RequestParam("from") String from,@RequestParam("to")String to,
			@RequestParam("departureDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date departureDate, Model model) {
		List<Flight> flights = flightService.findFlights(from, to, departureDate);
		if(to!="" || from!="" || !departureDate.equals(null)) {
			if(!flights.equals(null)) {
				model.addAttribute("flights",flights);
				return "mainPage";
			}
		}
		model.addAttribute("msg2", "No Flights Found!!!");
		return "mainPage";
			
	}
	
	@RequestMapping("/flightFinalize")
	public String flightFinalize(@RequestParam("flightId")long id, Model model) {
		Flight flight = flightService.findFlightById(id);
//		User user = userService.findUserById(userid);
		model.addAttribute("flight",flight);
//		model.addAttribute("thisUser",user);
		return "flightFinalizePage";
	}
}












