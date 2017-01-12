
public class Truck extends Vehicle{
	int NumberOfAxles;
	int MaxLoad;


	public Truck(String make, String model, String reg, int vehicleId, int numberOfSeats, int nAxles, int mLoad){
		super (make, model, reg, vehicleId, numberOfSeats);
		
		NumberOfAxles = nAxles;
		MaxLoad = mLoad;
	}

}
