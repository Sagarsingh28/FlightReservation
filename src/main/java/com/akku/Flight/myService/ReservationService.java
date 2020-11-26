package com.akku.Flight.myService;

import com.akku.Flight.dataTransferObject.ReservationRequest;
import com.akku.Flight.entities.Reservation;

public interface ReservationService {

	Reservation bookFlight(ReservationRequest request);
}
