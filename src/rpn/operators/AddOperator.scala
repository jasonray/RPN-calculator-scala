package rpn.operators

class AddOperator extends BinaryOperator {
  def doOperation(lhs: Int, rhs: Int): Int = lhs + rhs;

  def handlesOperatorCharacter(operatorCharater: String): Boolean = operatorCharater.contentEquals("+");

}