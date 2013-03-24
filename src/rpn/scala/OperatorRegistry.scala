package rpn.scala

class OperatorRegistry {

  def getOperator(operatorCharacter: String): Operator = {
    var operatorHandler: Operator = null
    if (operatorCharacter == "+") {
      operatorHandler = new AddOperator
    } else if (operatorCharacter == "-") {
      operatorHandler = new SubtractOperator
    }
    return operatorHandler;
  }
}