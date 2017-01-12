package paintWizard;

public class Paint {
	String Name;
	double Volume; // litres
	double Price; // pounds
	double Spread; // metres squared

	public Paint(String Name, double Volume, double Price, double Spread ) {
		this.Name = Name;
		this.Volume = Volume;
		this.Price = Price;
		this.Spread = Spread;
	}  
}