package com.akku.Flight.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

import com.akku.Flight.entities.Reservation;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Component
public class PDFGeneratorImpl implements PDFGenerator {

	@Override
	public void generateItinerary(Reservation reservation, String path) {
		Document doc = new Document();
		try {
			PdfWriter.getInstance(doc, new FileOutputStream(path));
			
			doc.open();
			doc.add(generatePdf(reservation));
			doc.close();
		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		}
	}

	private PdfPTable generatePdf(Reservation reservation) {
		PdfPTable table = new PdfPTable(2);
		
		PdfPCell cell;
		
		cell = new PdfPCell(new Phrase("Flight Details "));
		cell.setColspan(2);
		table.addCell(cell);
		
		cell = new PdfPCell(new Phrase("Personal Information "));
		cell.setColspan(2);
		table.addCell(cell);
		
		table.addCell("Passenger Name");
		table.addCell(reservation.getPassenger().getFirstName()+" "+reservation.getPassenger().getLastName());
		
		table.addCell("Passenger Email ID");
		table.addCell(reservation.getPassenger().getEmailId());
		
		table.addCell("Passenger Phone Number");
		table.addCell(reservation.getPassenger().getPhoneNumber());
		
		cell = new PdfPCell(new Phrase("Flight Information"));
		cell.setColspan(2);
		table.addCell(cell);
		
		table.addCell("Flight Airlines");
		table.addCell(reservation.getFlight().getOperatingAirlines());
		
		table.addCell("Flight Number");
		table.addCell(reservation.getFlight().getFlightNo());
		
		table.addCell("From");
		table.addCell(reservation.getFlight().getDepartureCity());
		
		table.addCell("To");
		table.addCell(reservation.getFlight().getArrivalCity());
		
		table.addCell("Flight Date");
		table.addCell(reservation.getFlight().getDateOfDeparture().toString());
		
		table.addCell("Flight Time");
		table.addCell(reservation.getFlight().getEstimatedDepartureTime().toString());
		
		return table;
	}
}
