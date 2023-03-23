import scala.annotation.tailrec

object FactorialUsingTailRecursion extends App {

  def factorial(number: Int): Long = {
    @tailrec
    def computeFactorial(number: Int, accumulator: Long): Long = {
      if (number < 0)
        throw new IllegalArgumentException("Cannot find factorial of negative number")
      else if (number == 0)
        accumulator
      else
        computeFactorial(number - 1, number * accumulator)

    }

    computeFactorial(number, 1)
  }
}
