package rpn.operators

import rpn.RpnStack;

trait Operator {
  def performOperation(numbers: RpnStack): Int
  def handlesOperatorCharacter(operatorCharater: String): Boolean
}