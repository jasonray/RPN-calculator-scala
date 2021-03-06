package rpn

class RpnCalculator {
  private val numbers = new RpnStack
  private val registry = new OperatorRegistry

  def enter(operand: Int): Unit = {
    numbers.push(operand)
  }

  def perform(operatorCharacter: String): Int = {
    registry.getOperator(operatorCharacter).performOperation(numbers);
  }
}