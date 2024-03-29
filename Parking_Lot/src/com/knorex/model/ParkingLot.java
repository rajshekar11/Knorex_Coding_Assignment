package com.knorex.model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

	private int numberOfFloors;
	private int spacesPerFloors;
	List<Floor> floors;
	List<VehicleToken> tokens;
	
	public ParkingLot() {
		// TODO Auto-generated constructor stub
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	public int getSpacesPerFloors() {
		return spacesPerFloors;
	}

	public void setSpacesPerFloors(int spacesPerFloors) {
		this.spacesPerFloors = spacesPerFloors;
	}

	public List<Floor> getFloors() {
		return floors;
	}

	public void setFloors(List<Floor> floors) {
		this.floors = floors;
	}

	public ParkingLot(int numberOfFloors, int spacesPerFloors) {
		super();
		this.numberOfFloors = numberOfFloors;
		this.spacesPerFloors = spacesPerFloors;
		this.floors = new ArrayList<>();
		this.tokens=new ArrayList<>();
		for(int i=1;i<=numberOfFloors;i++) {
			floors.add(new Floor(i, spacesPerFloors, spacesPerFloors, spacesPerFloors));
		}
	}
	
	public void addVehicle(String registrationNumber, String color, VehicleType type) {
		for(Floor floor:floors) {
			for(VehicleSpace space:floor.spaces) {
				if(space.isAvailability() && space.getVehicleType().equals(type)) {
					space.setAvailability(false);
					tokens.add(new VehicleToken(space.getSpaceNumber(),floor.getFloorNumber(),registrationNumber, LocalDateTime.now()));
					System.out.println("Vehicle Parked Successfully regNumber"+registrationNumber+" floor Number: "+floor.getFloorNumber()+" space number: "+space.getSpaceNumber());
					return;
				}
			}
		}
		throw new RuntimeException("Parking is full");
	}
	
	public boolean removeVehicle(String registrationNumber) {
		
			VehicleToken toke=new VehicleToken();
			for(VehicleToken tok:tokens) {
				if(tok.getRegistrationNumber().equals(registrationNumber)) {
					toke=tok;
				}
			}
	
						VehicleSpace sp=null;
						for(Floor floor:floors) {
							if(floor.getFloorNumber()==toke.getFloorNumber()) {
								for(VehicleSpace space: floor.spaces) {
									if(space.getSpaceNumber()==toke.getSpaceNumber()) {
										space.setAvailability(true);
										sp=space;
									}
								
						}
						Duration duration=Duration.between(toke.getTimeStamp(), LocalDateTime.now().plusHours(2));
						double durationInHours=duration.toHours();
						int cost=calculateCost(sp.getVehicleType(), durationInHours);
						System.out.println("Vehicle removed total cost: "+cost);
						return true;
						
					}
		}
				System.out.println("Error");
				return false;
	}
	
	public int calculateCost(VehicleType vehicleType,double durationHours) {
		if(vehicleType==VehicleType.BIKE) {
			return (int) (CostStrategy.bike_Cost*durationHours);
		}
		else if(vehicleType==VehicleType.CAR) {
			return (int) (CostStrategy.car_Cost*durationHours);
		}
		else if(vehicleType==VehicleType.BUS) {
			return (int) (CostStrategy.bus_Cost*durationHours);
		}
		throw new IllegalArgumentException("VehicleType not correct");
	}
	
	public boolean checkAvailability(int floorNumber,VehicleType vehicleType) {
		for(VehicleSpace space: floors.get(floorNumber-1).spaces) {
			if(space.isAvailability() && space.getVehicleType().equals(vehicleType)) {
				return true;
			}
		}
		return false;
	}
	
	public ParkingLot init(int numberOfFloors,int numberOfSpaces) {
		return new ParkingLot(numberOfFloors, numberOfSpaces);
	}
	
	
}
