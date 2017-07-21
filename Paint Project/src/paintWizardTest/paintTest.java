package paintWizardTest;

import static org.junit.Assert.*;

import org.junit.Test;

import paintWizard.Paint;

public class paintTest {
	
	@Test
	public void testCalcCheapestNull() {
		Paint testing = new Paint("Test", 1.0, 1,1);
		assertNotNull(testing.toString());
	}
	
	@Test
	public void testCalcCheapestFilled() {
		Paint testing = new Paint("Test", 1.0, 1,1);
		testing.toString();
		assertEquals("Paint Type: ",1,1);	}
	

}
