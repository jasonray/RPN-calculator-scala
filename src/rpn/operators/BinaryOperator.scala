package rpn.operators

import rpn.RpnStack;

abstract class BinaryOperator extends Operator {
  def performOperation(numbers: RpnStack): Int = {
    val result = doOperation(numbers.pop, numbers.pop);
    numbers.push(result)
    return result
  }

  def doOperation(lhs: Int, rhs: Int): Int;
}