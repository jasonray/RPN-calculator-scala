package rpn
import rpn.operators.AddOperator
import rpn.operators.AverageOperator
import rpn.operators.SubtractOperator
import rpn.operators.AbsoluteOperator
import rpn.operators.Operator
import rpn.operators.MultiplicationOperator
import rpn.operators.ClearOperator

class OperatorRegistry {

  private val operators = Seq(
      new AddOperator, 
      new SubtractOperator, 
      new AbsoluteOperator, 
      new AverageOperator, 
      new MultiplicationOperator,
      new ClearOperator      
      );

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