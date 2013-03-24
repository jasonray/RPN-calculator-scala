package rpn.operators

class SubtractOperator extends BinaryOperator {
  def doOperation(lhs: Int, rhs: Int): Int = {
    lhs - rhs;
  }

  def handlesOperatorCharacter(operatorCharater: String): Boolean = {
    return (operatorCharater.contentEquals("-"));
  }

}