import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HashMapTest {

	ReadFromFile methods;
	ArrayList<String> populate;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		methods = new ReadFromFile();
		populate = new ArrayList<String>();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void readFromFileTest() throws IOException {
		methods.readFromFile("C:\\Users\\Admin\\Desktop\\readFrom.txt", populate);
		assertEquals("Result wasn't expected", "hello", populate.get(0));
		assertEquals("Result wasn't expected", "goodbye", populate.get(1));
		
	}
	
	@Test
	public void stringSorterTest() {
		assertEquals("Result wasn't expected", "abcde", methods.sortString("dcbea"));
	}

	@Test
	public void stringWithMostAnagramsTest() throws IOException {
		methods.readFromFile("C:\\Users\\Admin\\Desktop\\readFrom.txt", populate);
		assertEquals("Result wasn't expected", "hello", methods.stringWithMostAnagrams());
	}
	
	@Test
	public void numberOfAnagramsTest()
	{
		assertEquals("Result wasn't expected A", true, methods.isAnagram("helloe", "heello"));
		assertTrue("Result wasn't expected B", methods.isAnagram("listen", "SILENT"));
		assertEquals("Result wasn't expected C", false, methods.isAnagram("goodbye", "bye"));
		assertEquals("Result wasn't expected D", false, methods.isAnagram("bob", "fish"));
	}
}
