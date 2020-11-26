package com.akku.Flight.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="reservation")
public class Reservation extends AbstractEntity {

	@Column(name="checked_in")
	private  boolean checkedIn;
	
	@Column(name="no_of_bags")
	private int noOfBags;
	
	@OneToOne
	private Passenger passenger;
	
	@OneToOne
	private Flight flight;
	
	private Timestamp created;
	
	public boolean getCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNoOfBags() {
		return noOfBags;
	}
	public void setNoOfBags(int noOfBags) {
		this.noOfBags = noOfBags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Timestamp getCreated() {
		return created;
	}
	public void setCreated(Timestamp created) {
		this.created = created;
	}
	
}
