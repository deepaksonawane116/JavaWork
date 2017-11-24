import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LibraryFunctionsTest {

	LibraryFunctions libraryFunctions;
	Item book2;
	Item book1;
	User user1;
	
	@Before
	public void setUp() throws Exception {
		libraryFunctions = new LibraryFunctions();
		book1 = new Book("Call of Cthulu", false, "H.P. Lovecraft", 25, 0);
		book2 = new Book("Call of Cthulu CHECKED OUT", true, "H.P. Lovecraft", 25, 0);
		
		user1 = new User("00001", "UserName One");
	}

	@After
	public void tearDown() throws Exception {
		libraryFunctions.flushItemList();
	}
	
	@Test
	public void getItemIDFromListTest() {
		libraryFunctions.addItem(book1);
		assertEquals("Result wasn't expected", 3, libraryFunctions.getItemIDFromList(book1));
	}
	
	@Test
	public void findItemTest() {
		libraryFunctions.addItem(book1);
		assertEquals("Result wasn't expected", book1, libraryFunctions.findItem(book1));
	}
	
	@Test
	public void addItemTest(){
		libraryFunctions.addItem(book1);
		assertEquals("Result wasn't expected", book1, libraryFunctions.getItemList().get(0));
	}
	
	@Test
	public void removeItemTest(){
		libraryFunctions.addItem(book1);
		libraryFunctions.addItem(book2);
		assertEquals("Result wasn't expected", book1, libraryFunctions.getItemList().get(0));
		libraryFunctions.removeItem(book1);
		assertEquals("Result wasn't expected", null, libraryFunctions.findItem(book1));
	}
	
	@Test
	public void checkOutItemTest() {
		libraryFunctions.addItem(book1);
		assertFalse("Result wasn't expected", book1.isCheckedOut());
		libraryFunctions.checkOutItem(book1);
		assertTrue("Result wasn't expected", book1.isCheckedOut());
	}
	
	@Test
	public void checkInItemTest() {
		libraryFunctions.addItem(book2);
		assertTrue("Result wasn't expected", book2.isCheckedOut());
		libraryFunctions.checkInItem(book2);
		assertFalse("Result wasn't expected", book2.isCheckedOut());
	}
	
	
	

}
