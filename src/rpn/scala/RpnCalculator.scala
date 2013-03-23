package rpn.scala

class RpnCalculator {
  private val numbers = new RpnStack

  def enter(operand: Int): scala.Unit = {
    numbers.push(operand)
  }

  def perform(operator: String): Int = {
    var operatorHandler: Operator = null
    if (operator == "+") {
      operatorHandler = new AddOperator
    } else if (operator == "-") {
      operatorHandler = new SubtractOperator
    }
    operatorHandler.performOperation(numbers);
  }
}