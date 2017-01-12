import static org.junit.Assert.*;

import org.junit.Test;


public class tooHotTest {

	@Test
	public void tempChecktest() {
		tooHot testing = new tooHot();
		boolean Temp = testing.tempCheck(76, true);
		assertEquals(true, 76);
		
		
		
	}

}
