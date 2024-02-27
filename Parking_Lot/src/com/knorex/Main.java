package com.knorex;

import java.util.Scanner;

import com.knorex.model.ParkingLot;
import com.knorex.model.VehicleToken;
import com.knorex.model.VehicleType;

public class Main {

	public static void main(String[] args) {
		ParkingLot parkingLot=new ParkingLot(2,2); //i am creating a parking lot of 2 floors and 2 spaces in each floor
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Please choose following options: ");
			System.out.println("1: Add vehicle ");
			System.out.println("2: Remove Vehicle ");
			System.out.println("3: check availability");
			System.out.println("4: Exit");
			int n=sc.nextInt();
			if(n==1) {
				//here i am adding vehicles as you can see in the i am adding 2 vehicles in with type bike in the 1st floor
				parkingLot.addVehicle("Ka34", "white", VehicleType.BIKE);
				parkingLot.addVehicle("Ka20", "teal", VehicleType.CAR);
				parkingLot.addVehicle("Ka21", "green", VehicleType.BUS);
				parkingLot.addVehicle("Tn24", "red", VehicleType.BIKE);
			}
			else if(n==2) {
				//here i have added a two hour of exiting time for every vehicles and when registration number 
				//is entered the cost of parking is determined by vehicle type and for two hours
				System.out.println("Enter registration Number");
				String registrationNumber=sc.next();
				parkingLot.removeVehicle(registrationNumber);
			}
			else if(n==3) {
				// here i am checking availability for every floor and since there are two bikes in the first floor availability
				// will be false
				System.out.println("Enter floor number");
				int floorNumber=sc.nextInt();
				
				boolean check=parkingLot.checkAvailability(floorNumber, VehicleType.BIKE);
				System.out.println("Availability: "+check);
			}
			else if(n==4) {
				System.out.println("Exited successfully");
				break;
			}
			else {
				System.out.println("Please enter correct options");
				continue;
			}
		}
		
		
	}
}
