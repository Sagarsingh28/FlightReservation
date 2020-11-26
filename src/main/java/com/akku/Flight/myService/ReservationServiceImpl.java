package com.akku.Flight.myService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.akku.Flight.dataTransferObject.ReservationRequest;
import com.akku.Flight.entities.Flight;
import com.akku.Flight.entities.Passenger;
import com.akku.Flight.entities.Reservation;
import com.akku.Flight.myDAL.PassengerDAL;
import com.akku.Flight.myDAL.ReservationDAL;
import com.akku.Flight.util.EmailUtil;
import com.akku.Flight.util.PDFGenerator;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private PDFGenerator pdfGenerator;
	
	@Autowired
	private EmailUtil emailUtil;
	
	@Autowired
	private ReservationDAL reservationDal;
	
	@Autowired
	private FlightService flightService;
	
	@Autowired
	private PassengerDAL passengerDal;
	
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setEmailId(request.getPassengerEmailId());
		passenger.setPhoneNumber(request.getPassengerPhoneNo());
		passengerDal.save(passenger);
		
		Flight flight = flightService.findFlightById(request.getFlightId());
		
		Reservation reservation = new Reservation();
		reservation.setCheckedIn(false);
		reservation.setPassenger(passenger);
		reservation.setFlight(flight);
		
		String path = "E:\\SPRING_BOOT_PROJECTS\\extras\reservation"+reservation.getId()+".pdf";
		pdfGenerator.generateItinerary(reservation, path);
		
		emailUtil.sendMailWithPdf(passenger.getEmailId(), path);
		
		return reservationDal.save(reservation);
	}

}
