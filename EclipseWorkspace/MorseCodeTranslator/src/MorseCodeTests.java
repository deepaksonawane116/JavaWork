import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MorseCodeTests {

	Methods methods;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		methods = new Methods();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void translatorTest() {
		
		assertEquals("Result not expected", "HELLO", methods.translateFromMorse(".... . .-.. .-.. ---"));
		
	}
	
	@Test
	public void charTranslatorTest() {
		
		assertEquals("Result not expected", 'H', methods.getTranslation("...."));
	}
	
	@Test
	public void translateTOMorse() {
		
		assertEquals("Result not expected", "....", methods.translateToMorse("Hello world"));
	}

}
