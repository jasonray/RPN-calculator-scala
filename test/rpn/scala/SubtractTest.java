package rpn.scala;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubtractTest {
	@Test
	public void subtractNoNumbers() {
		RpnCalculator calc = new RpnCalculator();
		int result = calc.perform("-");
		assertEquals(0, result);
	}

	@Test
	public void subtractOneNumbers() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		int result = calc.perform("-");
		assertEquals(-1, result);
	}

	@Test
	public void subtractTwoNumbers() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(3);
		calc.enter(1);
		int result = calc.perform("-");
		assertEquals(2, result);
	}

	@Test
	public void subtractThreeNumbers() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(9);
		calc.enter(6);
		calc.enter(1);
		int result = calc.perform("-");
		result = calc.perform("-");
		assertEquals(4, result);
	}

}
