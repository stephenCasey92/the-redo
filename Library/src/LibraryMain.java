
public class LibraryMain {

	public static void main(String[] args) {
		
		
		// istantiation (allows to access methods in the class declared)
		Library in = new Library();
		
		// creating items
		Dissertation a = new Dissertation(1, "05/11/2009", "How not to code a library", "Jai Ho", 15000, "Software Engineering");
		Dissertation b = new Dissertation(2, "05/09/2011", "The correlation between Java and Mental Breakdowns", "Helen Evans", 20000, "Psychology");
		Dissertation c = new Dissertation(3, "01/04/2298", "Tips for time travel", "Ian Minion", 8000, "Physics");
		Dissertation d = new Dissertation(4, "24/12/2015", "The negative effects of accents in society", "Kyle Forbes", 12000, "Speech and Language Therapy");
		
		Book e = new Book(5, "23/02/2007", "Started from macdonalds now im here", "Jack Gallagher", "Autobiography", 600);
		Book f = new Book (6, "17/06/2011", "Rupert goes to Boarding School", "Rupert Langford", "Non-Fiction", 452);
		Book g = new Book (7, "30/09/2013", "Teaching idiots Java", "Elliott Womack", "Fiction", 1203);
		Book h =  new Book(8, "04/08/2016", "A year in the life of Trevell Paul", "Stephen Casey", "Biography", 523);
		
		Newspaper i = new Newspaper(9, "04/06/2017", "Trump accidentally Fires Nuke at North Korea", "The Sun");
		Newspaper j = new Newspaper(10, "21/04/2017", "Trevell Paul UK No.1 with Hip-Hop record 'Oracle life'", "The Daily Star");
		Newspaper k = new Newspaper(11, "16/04/2016", "Amit Samual wins silver in Judo... Loses to 12 year old girl", "The Telegraph");
		Newspaper l = new Newspaper (12, "13/05/2017", "Boris Johnson appointed leader of the world council", "The Mirror");
		
		Customer ca = new Customer("Jack", "Reacher", 01, "078126345676");
		Customer cb = new Customer ("Jason", "Bourne", 02, "07823456789");
		Customer cc = new Customer ("James", "Bond", 03, "07845678905");
		Customer cd = new Customer ("Lara", "Croft", 04, "07548467890");
		
		
		// adding items to array list
		in.itemList.add(a);
		in.itemList.add(b);
		in.itemList.add(c);
		in.itemList.add(d);
		in.itemList.add(e);
		in.itemList.add(f);
		in.itemList.add(g);
		in.itemList.add(h);
		in.itemList.add(i);
		in.itemList.add(j);
		in.itemList.add(k);
		in.itemList.add(l);
		
		in.personList.add(ca);
		in.personList.add(cb);
		in.personList.add(cc);
		in.personList.add(cd);
	}
	// Attributes
		// Constructor
		// Methods
}
