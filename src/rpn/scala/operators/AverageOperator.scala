package rpn.scala.operators
import rpn.scala.Operator
import rpn.scala.RpnStack

class AverageOperator extends Operator {
  def performOperation(numbers: RpnStack): Int = {
    var sum: Int = 0;
    var count: Int = 0;

    while (!numbers.isEmpty()) {
      val n: Int = numbers.pop
      sum += n;
      count += 1;
    }

    val average: Int = calculateAverage(sum, count);
    numbers.push(average);
    return average;
  }

  private def calculateAverage(total: Int, count: Int): Int = {
    if (count == 0) return 0;
    return total / count;
  }

  def handlesOperatorCharacter(operatorCharater: String): Boolean = {
    return (operatorCharater.contentEquals("AVERAGE") || operatorCharater.contentEquals("AVE"))
  }

}