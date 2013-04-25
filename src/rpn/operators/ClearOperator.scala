package rpn.operators

import rpn.RpnStack

class ClearOperator extends Operator {
  def performOperation(numbers: RpnStack): Int = {
    while (!numbers.isEmpty) numbers.pop
    0;
  }
  def handlesOperatorCharacter(operatorCharater: String) = operatorCharater.contentEquals("C");

}