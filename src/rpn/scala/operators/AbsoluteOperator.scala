package rpn.scala.operators
import rpn.scala.Operator
import rpn.scala.RpnStack

class AbsoluteOperator extends Operator {
  def performOperation(numbers: RpnStack): Int = {
    val n = numbers.pop
    var result: Int = getAbsolute(n)

    numbers.push(result)
    return result
  }

  def handlesOperatorCharacter(operatorCharater: String): Boolean = {
    return (operatorCharater.contentEquals("||"));
  }

  private def getAbsolute(n: Int): Int = {
    if (n > 0)
      return n;
    else if (n < 0)
      return n * -1;
    else
      return 0
  }

}