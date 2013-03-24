package rpn;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rpn.RpnCalculator;

public class AverageTest {
	@Test
	public void averageNoNumbers() {
		RpnCalculator calc = new RpnCalculator();
		int result = calc.perform("AVERAGE");
		assertEquals(0, result);
	}

	@Test
	public void averageOneNumber() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		int result = calc.perform("AVERAGE");
		assertEquals(1, result);
	}

	@Test
	public void averageTwoNumber() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		calc.enter(3);
		int result = calc.perform("AVERAGE");
		assertEquals(2, result);
	}

	@Test
	public void averageFiveNumber() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		calc.enter(2);
		calc.enter(3);
		calc.enter(4);
		calc.enter(5);
		int result = calc.perform("AVERAGE");
		assertEquals(3, result);
	}

	@Test
	public void useAve() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		calc.enter(3);
		int result = calc.perform("AVE");
		assertEquals(2, result);
	}
}