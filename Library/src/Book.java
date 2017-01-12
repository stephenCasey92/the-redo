
public class Book extends Item{
	
	// Attributes
	public String Title;
	
	public String Author;
	
	public String Genre;
	
	public int pageCount;
	
	public Book( int itemID, String datePublished, String Title, String Author, String Genre, int pageCount){
		super(itemID, datePublished);
		
		this.Title = Title;
		this.Author = Author;
		this.Genre = Genre;
		this.pageCount = pageCount;
		
		
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
		// Constructor
		// Methods

}
