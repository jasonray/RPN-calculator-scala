package rpn
import rpn.operators.AddOperator
import rpn.operators.AverageOperator
import rpn.operators.SubtractOperator
import rpn.operators.AbsoluteOperator
import rpn.operators.Operator

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