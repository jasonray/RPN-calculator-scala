package rpn.scala
import rpn.scala.operators.AbsoluteOperator

class OperatorRegistry {

  private val operators = Seq(new AddOperator, new SubtractOperator, new AbsoluteOperator);

  def getOperator(operatorCharacter: String): Operator = {
    var relevantOperator: Operator = null;

    if (operatorCharacter != null) {
      operators.foreach {
        operator =>
          if (operator.handlesOperatorCharacter(operatorCharacter))
            relevantOperator = operator
      }
    }

    return relevantOperator;

  }
}