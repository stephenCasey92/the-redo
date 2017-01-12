public class Car extends Vehicle {
	String bodyType;
	String fuelType;
	int numberOfDoors;

	public Car(String make, String model, String reg, 
			int vehicleId, int numberOfSeats, String bType, String fType,
			int nDoors) {
		super(make, model, reg, vehicleId, numberOfSeats);
		bodyType = bType;
		fuelType = fType;
		numberOfDoors = nDoors;

	}

}
