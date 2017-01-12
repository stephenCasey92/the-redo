import java.util.ArrayList;

public class Library {

	// create arrayLists for person and item

	ArrayList<Person> personList = new ArrayList<Person>();
	ArrayList<Item> itemList = new ArrayList<Item>();
	ArrayList<Item> checkOut = new ArrayList<Item>();

	// add a new book to the item arrayList

	public void addItem(int itemId, String datePublished, String Title,
			String Author, String Genre, int pageCount) {
		Book newBook = new Book(itemId, datePublished, Title, Author, Genre,
				000);
		itemList.add(newBook);
	}

	// add a new Dissertation to the item arrayList

	public void addItem(int itemId, String datePublished, String title,
			String author, int wordCount, String subject) {
		Dissertation newDissertation = new Dissertation(itemId, datePublished,
				title, author, 001, subject);
		itemList.add(newDissertation);
	}

	// add a new newspaper to the item arrayList;

	public void addItem(int itemId, String datePublished, String headline,
			String publisher) {
		Newspaper newNewspaper = new Newspaper(itemId, datePublished, headline,
				publisher);
		itemList.add(newNewspaper);
	}

	public void addItem(Item I) {
		itemList.add(I);
	}

	public void updateItem(int itemId, String datePublished, String newAuthor, String newPublishDate) {
		for (Item i : itemList){
			if (i.getItemID() == itemId && i.datePublished == datePublished)
			{
				
				//	TO-DO
				// update/change author of the item to the new author string
				// update/change published date of item to the new published date string
				// probably best not to change the item id, but it is possible if u want.
				
				
				
				// Think about what you would do if you needed to update a Book/Dissertation/Newspaper. (if you want to go into the update in this much detail)
				
						// These objects have additional attributes to the abstract Item class.
						// Could: Overload the function, object as parameter, etc.
			}
		}
	}

	public void deleteItem(int itemId) {
		for (Item i : itemList) {
			if (i.itemId == itemId) {
				itemList.remove(i);
				break;

			}
		}
	}

	// adds item in to checkOut array
	public void checkOut(int itemId) {
		for (Item i : itemList) {
			if (i.itemId == itemId) {
				checkOut.add(i);
				itemList.remove(i);
				break;
			}
		}
	}

	// adds item in to itemList list
	public void checkIn(int itemId) {
		for (Item i : checkOut) {
			if (i.itemId == itemId) {
				itemList.add(i);
				checkOut.remove(i);
				break;
			}
		}

	}

	//	update person

	public void updatePerson(String firstName, String Surname,   String newForename, String newLastName){
		for(Person p : personList){
			if (p.firstName == firstName && p.Surname == Surname){
				p.firstName = newForename;
				p.Surname = newLastName;
			}
		}
	}


	// add customer

	public void addPerson(String firstName, String Surname, int customerId,
			String telephone) {
		Customer newCustomer = new Customer(firstName, Surname, 0001,
				"0000000000");
		personList.add(newCustomer);
	}

	// add librarian

	public void addPerson(String firstName, String Surname, int employeeId) {
		Librarian newLibrarian = new Librarian(firstName, Surname, 0001);
		personList.add(newLibrarian);
	} 

	// delete any person

	public void deletePerson(String firstName, String Surname) {
		for (Person p : personList) {
			if (p.firstName.equals(firstName)) {
				if (p.Surname.equals(Surname)) {
					personList.remove(p);
					break;

				}
			}
		}
	}
}
