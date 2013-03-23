package rpn.scala

class AddOperator extends Operator {
  def performOperation(numbers: RpnStack): Int = {
    val rhs = numbers.pop
    val lhs = numbers.pop
    val result = lhs + rhs
    numbers.push(result)
    return result
  }
}