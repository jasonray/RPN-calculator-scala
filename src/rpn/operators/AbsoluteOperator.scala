package rpn.operators

import rpn.RpnStack

class AbsoluteOperator extends Operator {
  def performOperation(numbers: RpnStack): Int = {
    val result: Int = getAbsolute(numbers.pop)
    numbers.push(result)
    result
  }

  def handlesOperatorCharacter(operatorCharater: String): Boolean = {
    return (operatorCharater.contentEquals("||"));
  }

  private def getAbsolute(n: Int): Int =
    if (n > 0)
      n;
    else if (n < 0)
      n * -1;
    else
      0

}