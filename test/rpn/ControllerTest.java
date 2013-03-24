package rpn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import rpn.RpnCalculator;

public class ControllerTest {
	@Test
	public void enterTest() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
	}

	@Test
	public void performTest() {
		RpnCalculator calc = new RpnCalculator();
		int result = calc.perform("+");
		assertTrue(true);
		assertEquals(0, result);
	}

}
