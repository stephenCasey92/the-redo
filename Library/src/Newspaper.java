
public class Newspaper extends Item{


	// Attributes
	public String headline;
	public String publisher;
	
	public Newspaper(int itemID, String datePublished, String headline, String publisher){
		super(itemID, datePublished);
		
	}
	
	
	
	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	

		// Constructor
		// Methods
}
