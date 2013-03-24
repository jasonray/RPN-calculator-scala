package rpn.scala

class RpnCalculator {
  private val numbers = new RpnStack
  private val registry = new OperatorRegistry

  def enter(operand: Int): scala.Unit = {
    numbers.push(operand)
  }

  def perform(operator: String): Int = {
    val operatorHandler = registry.getOperator(operator);
    operatorHandler.performOperation(numbers);
  }
}