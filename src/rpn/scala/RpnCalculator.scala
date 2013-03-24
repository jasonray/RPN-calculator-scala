package rpn.scala

class RpnCalculator {
  private val numbers = new RpnStack
  private val registry = new OperatorRegistry

  def enter(operand: Int): scala.Unit = {
    numbers.push(operand)
  }

  def perform(operatorCharacter: String): Int = {
    val operatorHandler = registry.getOperator(operatorCharacter);

    if (operatorHandler == null)
      throw new IllegalArgumentException("Unknown Operator " + operatorCharacter)

    operatorHandler.performOperation(numbers);
  }
}