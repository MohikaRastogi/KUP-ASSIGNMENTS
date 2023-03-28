package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class FibonacciTest extends AnyFlatSpec {
  val fibonacci = new Fibonacci
  behavior of "FibonacciTest"

  it should "findNthNumberInFibonacci" in {
    assert(fibonacci.findNthNumberInFibonacci(1) == 1)
    assert(fibonacci.findNthNumberInFibonacci(2) == 1)
    assert(fibonacci.findNthNumberInFibonacci(10) == 55)
    assert(fibonacci.findNthNumberInFibonacci(8) == 21)
  }

}
