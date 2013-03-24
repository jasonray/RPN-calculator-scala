package rpn;

import static org.junit.Assert.*;

import org.junit.Test;

import rpn.RpnCalculator;

public class AddTest {
	@Test
	public void addTwoNumbers() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		calc.enter(2);
		int result = calc.perform("+");
		assertEquals(3, result);
	}

	@Test
	public void addOneNumber() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		int result = calc.perform("+");
		assertEquals(1, result);
	}

	@Test
	public void addNoNumbers() {
		RpnCalculator calc = new RpnCalculator();
		int result = calc.perform("+");
		assertEquals(0, result);
	}

	@Test
	public void addTwoNumbersThenAnother() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		calc.enter(2);
		calc.perform("+");
		calc.enter(4);
		int result = calc.perform("+");
		assertEquals(7, result);
	}
	
	@Test
	public void threeNumbersOnQueueThenAdd() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		calc.enter(2);
		calc.enter(3);
		int result = calc.perform("+");
		assertEquals(5, result);
	}
}
