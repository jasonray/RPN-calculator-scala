package rpn.scala

class AddOperator extends BinaryOperator {
  def doOperation(lhs: Int, rhs: Int): Int = {
    lhs + rhs;
  }
}