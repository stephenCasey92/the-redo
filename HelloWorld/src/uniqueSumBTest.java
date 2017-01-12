import static org.junit.Assert.*;

import org.junit.Test;


public class uniqueSumBTest {

	@Test
	public void uniqueSumTest() {
		uniqueNumberB testing = new uniqueNumberB();
		int myNumber = testing.uniqueSum(10, 10, 13);
		assertEquals(myNumber, 13);
		
	}

}
