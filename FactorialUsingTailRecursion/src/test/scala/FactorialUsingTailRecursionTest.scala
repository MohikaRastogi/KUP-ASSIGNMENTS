import org.scalatest.funsuite.AnyFunSuite

class FactorialUsingTailRecursionTest extends AnyFunSuite
{
  test("FactorialUsingTailRecursion.factorial()") {
    assert(FactorialUsingTailRecursion.factorial(3) === 6)
  }
  test("FactorialUsingTailRecursion.factorial2()") {
    assert(FactorialUsingTailRecursion.factorial(10) === 3628800)
  }
  test("FactorialUsingTailRecursion.factorial3()"){
    assert(FactorialUsingTailRecursion.factorial(1) === 1)
  }
  test("FactorialUsingTailRecursion.factorial4()") {
    assert(FactorialUsingTailRecursion.factorial(0) === 1)
  }

}
