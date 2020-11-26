package com.akku.Flight.util;

import com.akku.Flight.entities.Reservation;

public interface PDFGenerator {

	void generateItinerary(Reservation reservation,String path);
}
