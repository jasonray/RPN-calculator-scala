package rpn.scala

class OperatorRegistry {

  private val operators = Seq(new AddOperator, new SubtractOperator);

  def getOperator(operatorCharacter: String): Operator = {
    var operatorHandler: Operator = null;

    if (operatorCharacter != null) {
      operators.foreach {
        operator =>
          if (operator.handlesOperatorCharacter(operatorCharacter))
            operatorHandler = operator
      }
    }

    return operatorHandler;

  }
}