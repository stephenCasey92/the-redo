import static org.junit.Assert.*;

import org.junit.Test;

public class LibraryTest {

		// test items added
	@Test
	public void addItem() {
		Library testing = new Library();
		testing.addItem(0, "01/01/0001", "Title", "Author", "Genre", 001);
		assertEquals(1, testing.itemList.size());
	}

	@Test
	public void updateItem() {
		Library testing = new Library();
		String updateItem = testing.updateItem("Chris");
		assertEquals(updateItem, 2);
	}
	// adds an item then removes the same item from list to check function
	@Test
	public void deleteItem() {
		Library testing = new Library();
		testing.addItem(0, "01/01/0001", "Title", "Author", "Genre", 001);
		testing.deleteItem(0);
		assertEquals(0, testing.itemList.size());
	}
	@Test
	public void checkOut() {
		Library testing = new Library();
		testing.addItem(0, "01/01/0001", "Title", "Author", "Genre", 001);
		testing.checkOut(0);
		assertEquals(1,testing.checkOut.size());
	}
	@Test
	// removes items from checkOut arrayList
	public void checkIn(){
		Library testing = new Library();
		testing.checkIn(1);
		assertEquals(0, testing.checkOut.size());
	}
	
	// test employee added
	@Test
	public void addPerson(){
		Library testing = new Library();
		testing.addPerson("John", "Smith", 0001);
		assertEquals(1, testing.personList.size());
	}
	
	// Update person
	@Test
	
	public void updatePerson(){
		Library testing = new Library();
		testing.addPerson("John", "Smith", 0001);
		testing.updatePerson("John", "Smith", "newForename", "newLastName");
		assertEquals("FAIL", testing.personList.get(0).getFirstName(), "newForename");
		
		
	}

	@Test
	public void deletePerson(){
		Library testing = new Library();
		testing.addPerson("John", "Smith", 001);
		testing.deletePerson("John", "Smith");
		assertEquals(0, testing.personList.size());
		
	}
	
	
}
