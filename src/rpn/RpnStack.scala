package rpn

class RpnStack {
  private val numbers = new scala.collection.mutable.Stack[Int]

  def push(x: Int) = numbers.push(x)
  def pop() = if (numbers.isEmpty) 0 else numbers.pop()
  def isEmpty() = numbers.isEmpty
}