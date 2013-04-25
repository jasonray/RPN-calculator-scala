package rpn;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplicationTest {
	@Test
	public void multipleTwoNumbers() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(2);
		calc.enter(4);
		int result = calc.perform("*");
		assertEquals(8, result);
	}

	@Test
	public void multipleNegNumbers() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(-2);
		calc.enter(4);
		int result = calc.perform("*");
		assertEquals(-8, result);
	}

	@Test
	public void multiplyNoNumbers() {
		RpnCalculator calc = new RpnCalculator();
		int result = calc.perform("*");
		assertEquals(0, result);
	}

	@Test
	public void multiplyOneNumber() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		int result = calc.perform("*");
		assertEquals(0, result);
	}

	@Test
	public void multipleThreeNumbers() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(2);
		calc.enter(3);
		calc.perform("*");
		calc.enter(3);
		int result = calc.perform("*");
		assertEquals(18, result);
	}
}