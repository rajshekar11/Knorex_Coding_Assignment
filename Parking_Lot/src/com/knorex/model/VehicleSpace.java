package com.knorex.model;

public class VehicleSpace {

	private int spaceNumber;
	private boolean availability;
	private VehicleType vehicleType;
	
	public VehicleSpace() {
		// TODO Auto-generated constructor stub
	}

	public VehicleSpace(int spaceNumber, boolean availability, VehicleType vehicleType) {
		super();
		this.spaceNumber = spaceNumber;
		this.availability = availability;
		this.vehicleType = vehicleType;
	}

	public int getSpaceNumber() {
		return spaceNumber;
	}

	public void setSpaceNumber(int spaceNumber) {
		this.spaceNumber = spaceNumber;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	
}
