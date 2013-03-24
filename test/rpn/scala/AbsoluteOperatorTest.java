package rpn.scala;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AbsoluteOperatorTest {
	@Test
	public void one() {
		runTest(1, 1);
	}

	@Test
	public void negOne() {
		runTest(-1, 1);
	}

	@Test
	public void two() {
		runTest(2, 2);
	}

	@Test
	public void negTwo() {
		runTest(-2, 2);
	}

	@Test
	public void absOnEmptyStack() {
		RpnCalculator calc = new RpnCalculator();
		int result = calc.perform("||");
		assertEquals(0, result);
	}

	private void runTest(int n, int expected) {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(n);
		int result = calc.perform("||");
		assertEquals(expected, result);
	}

	@Test
	public void ensureResultIsOnStack() {
		RpnCalculator calc = new RpnCalculator();
		calc.enter(1);
		calc.enter(-5);
		calc.perform("||");

		// prove that 5 is on the stack by adding 1 to get 6
		assertEquals(6, calc.perform("+"));
	}
}
