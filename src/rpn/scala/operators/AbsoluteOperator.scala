package rpn.scala.operators
import rpn.scala.Operator
import rpn.scala.RpnStack

class AbsoluteOperator extends Operator {
  def performOperation(numbers: RpnStack): Int = {
    val value = numbers.pop
    var result: Int = 0;

    if (value > 0)
      result = value;
    else if (value < 0)
      result = value * -1;
    else
      result = 0

    numbers.push(result)
    return result
  }

  def handlesOperatorCharacter(operatorCharater: String): Boolean = {
    return (operatorCharater.contentEquals("||"));
  }

}