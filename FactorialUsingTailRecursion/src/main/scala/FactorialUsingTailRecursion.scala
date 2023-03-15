import scala.annotation.tailrec

object FactorialUsingTailRecursion extends App {

  def factorial(number: Int): Long = {
    @tailrec
    def computeFactorial(number: Int, accumulator: Long): Long = {
      if (number <= 1)
        accumulator
      else
        computeFactorial(number - 1, number * accumulator)

    }

    computeFactorial(number, 1)
  }

}
