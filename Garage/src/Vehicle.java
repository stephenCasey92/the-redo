public abstract class Vehicle {

	String vmake; // vehicle make
	String vmodel;// vehicle model
	String vregistration;// vehicle registration
	int vehicleId; // vehicle ID
	int vnumberOfSeats; // number of seats in the vehicle

	public Vehicle(String make, String model, String reg, int vId,
			int numberOfSeats) {

		this.vmake = make;
		this.vmodel = model;
		this.vregistration = reg;
		this.vehicleId = vId;
		this.vnumberOfSeats = numberOfSeats;

	}

}
