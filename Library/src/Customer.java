
public class Customer extends Person {

	// Attributes
	public int customerId;
	public String telephone;
	
	// Constructor
	
	public Customer(String firstName, String Surname, int customerId, String telephone){
	super(firstName, Surname);
	
	this.customerId = customerId;
	this.telephone = telephone;
	
	
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
	// Methods
}
