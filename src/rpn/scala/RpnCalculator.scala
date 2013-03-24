package rpn.scala

class RpnCalculator {
  private val numbers = new RpnStack
  private val registry = new OperatorRegistry

  def enter(operand: Int): scala.Unit = {
    numbers.push(operand)
  }

  def perform(operator: String): Int = {
    if (operator == null) throw new IllegalArgumentException

    val operatorHandler = registry.getOperator(operator);

    if (operatorHandler == null) throw new IllegalArgumentException("Unknown Operator " + operator)

    operatorHandler.performOperation(numbers);
  }
}