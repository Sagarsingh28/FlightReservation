package com.akku.Flight.dataTransferObject;

public class ReservationRequest {

	private long flightId;
	private String passengerFirstName;
	private String passengerLastName;
	private String passengerEmailId;
	private String passengerPhoneNo;
	private String cardName;
	private String cardNumber;
	private String cardexpire;
	private String cardCVV;

	public long getFlightId() {
		return flightId;
	}

	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}

	public String getPassengerFirstName() {
		return passengerFirstName;
	}

	public void setPassengerFirstName(String passengerFirstName) {
		this.passengerFirstName = passengerFirstName;
	}

	public String getPassengerLastName() {
		return passengerLastName;
	}

	public void setPassengerLastName(String passengerLastName) {
		this.passengerLastName = passengerLastName;
	}

	public String getPassengerEmailId() {
		return passengerEmailId;
	}

	public void setPassengerEmailId(String passengerEmailId) {
		this.passengerEmailId = passengerEmailId;
	}

	public String getPassengerPhoneNo() {
		return passengerPhoneNo;
	}

	public void setPassengerPhoneNo(String passengerPhoneNo) {
		this.passengerPhoneNo = passengerPhoneNo;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardexpire() {
		return cardexpire;
	}

	public void setCardexpire(String cardexpire) {
		this.cardexpire = cardexpire;
	}

	public String getCardCVV() {
		return cardCVV;
	}

	public void setCardCVV(String cardCVV) {
		this.cardCVV = cardCVV;
	}

}
