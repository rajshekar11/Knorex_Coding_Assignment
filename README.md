## Parking Lot System

## Project Structure:

Project is organized into following classes:

1. ParkingLot: Represents the parking lot and manages vehicle spaces.
2. Vehicle: Represents a vehicle with attributes such as vehicle type, registration number, color, and
any other necessary attributes.
3. Floor: Represents a floor in the parking lot with attributes like floor number, capacity for each
vehicle type, and vehicle spaces.
4. VehicleSpace: Represents a vehicle space with attributes such as space number, availability,
vehicle type, and any other necessary attributes.
5. CostStrategy: Represents the cost strategy for parking, allowing for varying costs based on the
vehicle type and supporting different currencies.


## Cost Structure

● Bike per hour ₹ 10
● Car / Jeep per hour ₹ 20
● Bus / Truck per hour ₹ 30


## Usage

1. Init : Initializes the parking lot with the given number of floors and vehicle spaces per floor for
each vehicle type.
2. addVehicle : Adds a vehicle of the specified type with the given registration number and color to
the parking lot.
3. removeVehicle : Removes the vehicle with the specified registration number from the parking lot.
4. checkAvailability : Checks the availability of vehicle spaces on the specified floor for the given
vehicle type.
