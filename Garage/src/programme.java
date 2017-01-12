

public class programme {



	
		
		
		
		public static void main(String[] args) {
			
			garage in = new garage();
			
			 Car a = new Car("vw", "golf", "AB12CDE", 1, 5, "hatchback", "petrol", 5);
			 Car b = new Car("audi", "a4", "BB12CEF", 2, 5, "saloon", "diesel", 5);
			 Car c= new Car("mercedes", "slk", "CH14POL", 3, 2, "convertible", "petrol", 2);
			
			 Truck d = new Truck("man", "sv3600", "IO11TYL", 4, 3, 4, 24);
			 Truck e = new Truck("ivuzu", "midget", "LI10RET", 5, 2, 3, 6);

			 Motorbike f = new Motorbike("Yamaha", "R1", "PL12SER", 6, 1, "super");
			 Motorbike g = new Motorbike("ducatti", "monster", "KJ15JHG", 7, 1,
					"sport");
		
			 Motorbike h = new Motorbike("BMW", "E3", "WA16ZQB", 8, 1, "tourer");
			
			 
			 
			 in.addVehicle(a);
			 in.addVehicle(b);
			 in.addVehicle(c);
			 in.addVehicle(d);
			 in.addVehicle(e);
			 in.addVehicle(f);
			 in.addVehicle(g);
			 in.addVehicle(h);
		
		

		
		
		
		
		}
		
}  