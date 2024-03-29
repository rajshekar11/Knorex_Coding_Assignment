package com.knorex.model;

import java.time.LocalDateTime;

public class VehicleToken {

	private int spaceNumber;
	private int floorNumber;
	private String registrationNumber;
	private LocalDateTime timeStamp;
	
	public VehicleToken() {
		// TODO Auto-generated constructor stub
	}
	
	


	public int getFloorNumber() {
		return floorNumber;
	}




	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}




	public VehicleToken(int spaceNumber, int floorNumber, String registrationNumber, LocalDateTime timeStamp) {
		super();
		this.spaceNumber = spaceNumber;
		this.floorNumber = floorNumber;
		this.registrationNumber = registrationNumber;
		this.timeStamp = timeStamp;
	}




	public int getSpaceNumber() {
		return spaceNumber;
	}
	public void setSpaceNumber(int spaceNumber) {
		this.spaceNumber = spaceNumber;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}




	@Override
	public String toString() {
		return "VehicleToken [spaceNumber=" + spaceNumber + ", floorNumber=" + floorNumber + ", registrationNumber="
				+ registrationNumber + ", timeStamp=" + timeStamp + "]";
	}
	
	
}
