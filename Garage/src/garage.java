	
import java.util.ArrayList;
import java.util.List;

public class garage {

	ArrayList<Vehicle> myList = new ArrayList<Vehicle>();

	public void addVehicle(String make, String model, String reg,
			int vehicleId, int numberOfSeats, String bType, String fType,
			int nDoors) {
		Car tempCar = new Car(make, model, reg, vehicleId, numberOfSeats,
				bType, fType, nDoors);
		myList.add(tempCar);
	}

	public void addVehicle(String make, String model, String reg,
			int vehicleId, int numberOfSeats, String bike) {
		Motorbike tempBike = new Motorbike(make, model, reg, vehicleId,
				numberOfSeats, bike);
		myList.add(tempBike);

	}

	public void addVehicle(String make, String model, String reg,
			int vehicleId, int numberOfSeats, int nAxles, int mLoad) {
		Truck tempTruck = new Truck(make, model, reg, vehicleId, numberOfSeats,
				nAxles, mLoad);
		myList.add(tempTruck);
	}

	public void addVehicle(Vehicle v) {
		myList.add(v);
	}

	public void Bill() {
		for (Vehicle v : myList) {
			if (v instanceof Car) {
				System.out.println("Service is £50");
			}

			if (v instanceof Motorbike) {
				System.out.println("Service is £40");
			}

			if (v instanceof Truck) {
				System.out.println("Service is £100");

			}
			
		}

	}public void removeVehicle (int vId){
		for ( Vehicle v : myList){
			if(v.vehicleId == vId){
				myList.remove(v);
				break;
			}
		}
	}
	public void removeVehicles (String type){
		for (Vehicle v : myList){
			if(type.equals("car")){
				if (v instanceof Car){
					myList.remove(v);
					break;
				}
			}else if (type.equals("Motorbike")){
				if (v instanceof Motorbike){
					myList.remove(v);
					break;
				}
				else if(type.equals("Truck")){
					if(v instanceof Truck){
						myList.remove(v);
						break;
					}
					
				}
			}
		}
	}
}
