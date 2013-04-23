package rpn.operators
import rpn.RpnStack;

class AverageOperator extends Operator {
  def performOperation(numbers: RpnStack): Int = {
    val average = cumlativeCalculateAverage(0, 0, numbers)

    numbers.push(average);
    return average;
  }

  private def cumlativeCalculateAverage(runningTotal: Int, runningCount: Int,  numbers: RpnStack): Int = {
    if (numbers.isEmpty)
      calculateAverage(runningTotal, runningCount)
    else
      cumlativeCalculateAverage(runningTotal + numbers.pop, runningCount + 1, numbers)
  }

  private def calculateAverage(total: Int, count: Int): Int = {
    if (count == 0)
      0;
    else
      total / count;
  }

  def handlesOperatorCharacter(operatorCharater: String): Boolean =
    operatorCharater.contentEquals("AVERAGE") || operatorCharater.contentEquals("AVE")

}