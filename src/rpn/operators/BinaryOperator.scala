package rpn.operators

import rpn.RpnStack;

abstract class BinaryOperator extends Operator {
  def performOperation(numbers: RpnStack): Int = {
    val rhs = numbers.pop
    val lhs = numbers.pop
    val result = doOperation(lhs, rhs);
    numbers.push(result)
    return result
  }

  def doOperation(lhs: Int, rhs: Int): Int;
}