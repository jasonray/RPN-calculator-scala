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
    new ClearOperator);

  def getOperator(operatorCharacter: String): Operator = {
    return getOperator(operators, operatorCharacter)
  }

  private def getOperator(operators: Seq[Operator], operatorCharacter: String): Operator =
    if (operatorCharacter == null)
      throw new IllegalArgumentException("Operator is required")
    else if (operators.isEmpty)
      throw new IllegalArgumentException("Unknown Operator " + operatorCharacter)
    else if (operators.head.handlesOperatorCharacter(operatorCharacter))
      operators.head
    else
      getOperator(operators.tail, operatorCharacter)

}