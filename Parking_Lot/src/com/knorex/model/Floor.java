package com.knorex.model;

import java.util.ArrayList;
import java.util.List;

public class Floor {

	private int floorNumber;
	private int bikeCapacity;
	private int carCapacity;
	private int busCapacity;
	List<VehicleSpace> spaces;
	
	
	
	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public int getBikeCapacity() {
		return bikeCapacity;
	}

	public void setBikeCapacity(int bikeCapacity) {
		this.bikeCapacity = bikeCapacity;
	}

	public int getCarCapacity() {
		return carCapacity;
	}

	public void setCarCapacity(int carCapacity) {
		this.carCapacity = carCapacity;
	}

	public int getBusCapacity() {
		return busCapacity;
	}

	public void setBusCapacity(int busCapacity) {
		this.busCapacity = busCapacity;
	}

	public List<VehicleSpace> getSpaces() {
		return spaces;
	}

	public void setSpaces(List<VehicleSpace> spaces) {
		this.spaces = spaces;
	}

	public Floor() {
		// TODO Auto-generated constructor stub
	}

	public Floor(int floorNumber, int bikeCapacity, int carCapacity, int busCapacity) {
		super();
		this.floorNumber = floorNumber;
		this.bikeCapacity = bikeCapacity;
		this.carCapacity = carCapacity;
		this.busCapacity = busCapacity;
		this.spaces = new ArrayList<>();
		
		for(int i=1;i<=bikeCapacity;i++) {
			spaces.add(new VehicleSpace(i, true, VehicleType.BIKE));
		}
		
		for(int i=1;i<=carCapacity;i++) {
			spaces.add(new VehicleSpace(i, true, VehicleType.CAR));
		}
		
		for(int i=1;i<=busCapacity;i++) {
			spaces.add(new VehicleSpace(i, true, VehicleType.BUS));
		}
	}
	
	
	
}
