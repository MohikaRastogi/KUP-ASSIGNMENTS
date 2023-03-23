import org.scalatest.funsuite.AnyFunSuite

class FactorialUsingTailRecursionTest extends AnyFunSuite {
  test("Test Case to check factorial of 3 is 6 or not") {
    assert(FactorialUsingTailRecursion.factorial(3) === 6)
  }
  test("Test case to check if factorial of 10 is 362880 or not") {
    assert(FactorialUsingTailRecursion.factorial(10) === 3628800)
  }
  test("Test Case to check factorial of 1 is 1 or not") {
    assert(FactorialUsingTailRecursion.factorial(1) === 1)
  }
  test("Test Case to check if factorial of 0 is 1 or not") {
    assert(FactorialUsingTailRecursion.factorial(0) === 1)
  }
  test("Test Case for Exception Handling") { //test case for exception handling
    assertThrows[IllegalArgumentException] {
      FactorialUsingTailRecursion.factorial(-1)
    }
  }
}
