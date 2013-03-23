package rpn.scala

trait Operator {
	def performOperation(numbers:RpnStack) : Int
}