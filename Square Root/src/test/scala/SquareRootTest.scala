package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class SquareRootTest extends AnyFlatSpec {
  val squareRootObject = new SquareRoot
  behavior of "SquareRootTest"

  "computeSquareRoot" should "return list of square root of positive integers " in {
    val list = List(4, 16, 25, 36)
    val expectedResult = List(2, 4, 5, 6)
    assert(squareRootObject.computeSquareRoot(list) == expectedResult)
  }

  "computeSquareRoot" should "return Int.MinValue for negative numbers" in {
    val inputList = List(4, -9, 16, 25, 36)
    val expectedResult = List(2.0, Int.MinValue, 4.0, 5.0, 6.0)
    assert(squareRootObject.computeSquareRoot(inputList) == expectedResult)
  }

  "computeSquareRoot" should "return square root of any number, if it perfect square or not" in {
    val inputList = List(4, 3, 16, 13, 36)
    val expectedResult = List(2.0, 1.7320508075688772, 4.0, 3.605551275463989, 6.0)
    assert(squareRootObject.computeSquareRoot(inputList) == expectedResult)
  }

}
