package rpn.scala
import rpn.scala.operators.AbsoluteOperator
import rpn.scala.operators.AverageOperator

class OperatorRegistry {

  private val operators = Seq(new AddOperator, new SubtractOperator, new AbsoluteOperator, new AverageOperator);

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