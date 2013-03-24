package rpn.scala

class OperatorRegistry {

  private val operators = Seq(new AddOperator, new SubtractOperator);

  def getOperator(operatorCharacter: String): Operator = {
    var relevantOperator: Operator = null;

    if (operatorCharacter != null) {
      operators.foreach {
        operator =>
          if (operator.handlesOperatorCharacter(operatorCharacter))
            relevantOperator = operator
      }
    }

    return relevantOperator;

  }
}