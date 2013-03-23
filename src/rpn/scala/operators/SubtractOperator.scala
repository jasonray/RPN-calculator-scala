package rpn.scala

class SubtractOperator extends BinaryOperator {
  def doOperation(lhs: Int, rhs: Int): Int = {
    lhs - rhs;
  }

}