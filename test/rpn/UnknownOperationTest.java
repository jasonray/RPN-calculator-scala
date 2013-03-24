package rpn;

import org.junit.Test;

import rpn.RpnCalculator;

public class UnknownOperationTest {
	@Test(expected = IllegalArgumentException.class)
	public void unknownOperation() {
		RpnCalculator controller = new RpnCalculator();
		controller.perform("?");
		// expect error
	}

	@Test(expected = IllegalArgumentException.class)
	public void blankOperand() {
		RpnCalculator controller = new RpnCalculator();
		controller.perform(null);
		// expect error
	}
}
