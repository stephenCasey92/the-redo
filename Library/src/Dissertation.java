
public class Dissertation extends Item {
	
	// Attributes
	public String title;
	public String author;
	public String subject;
	public int wordCount;
	
	// Constructor
	
	public Dissertation(int itemID, String datePublished, String title, String author, int wordCount, String subject){
		super(itemID, datePublished);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getwordCount() {
		return wordCount;
	}

	public void setWordCount(int wordCount) {
		this.wordCount = wordCount;
	}
	
		
	
		// Methods
	

}
