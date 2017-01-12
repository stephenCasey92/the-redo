import static org.junit.Assert.*;

import org.junit.Test;


public class tooHotTest {

	@Test
	public void tempChecktest() {
		tooHot testing = new tooHot();
		assertEquals(true, testing.tempCheck(76, true));
		
		assertEquals(false, testing.tempCheck(55, false));
		
		assertEquals(true, testing.tempCheck(91, true));
		
		assertEquals(false, testing.tempCheck(59, true));
	}

}
