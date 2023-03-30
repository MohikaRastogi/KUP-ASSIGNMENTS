package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class ArithmeticOperationTest extends AnyFlatSpec {

  behavior of "ArithmeticOperationTest"
  val arithmeticOperationObject = new ArithmeticOperation

  "ArithmeticOperation" should "throw an IllegalArgumentException for empty input list" in {
    val inputList = List.empty[Option[Int]]
    val exception = intercept[IllegalArgumentException] {
      arithmeticOperationObject.arithmeticOperationOnList(inputList, "Addition")
    }
    assert(exception.getMessage == "List is empty")
  }


  it should "return the correct result for addition" in {
    val inputList = List(Some(1), Some(2), Some(3), Some(4))
    val expectedOutput = 10
    val result = arithmeticOperationObject.arithmeticOperationOnList(inputList, "Addition")
    assert(result == expectedOutput)
  }

  it should "return the correct result for subtraction" in {
    val inputList = List(Some(5), Some(2), Some(1))
    val expectedOutput = 2
    val result = arithmeticOperationObject.arithmeticOperationOnList(inputList, "Subtraction")
    assert(result == expectedOutput)
  }

  it should "return the correct result for multiplication" in {
    val inputList = List(Some(2), Some(3), Some(4))
    val expectedOutput = 24
    val result = arithmeticOperationObject.arithmeticOperationOnList(inputList, "Multiplication")
    assert(result == expectedOutput)
  }

  it should "throw an IllegalArgumentException for invalid operation type" in {
    val inputList = List(Some(1), Some(2), Some(3), Some(4))
    val exception = intercept[IllegalArgumentException] {
      arithmeticOperationObject.arithmeticOperationOnList(inputList, "InvalidOperation")
    }
    assert(exception.getMessage === "Invalid Operation")
  }

  it should "return the correct result for Double values addition" in {
    val inputList = List(Some(2.1), Some(3.4), Some(4.5))
    val expectedOutput = 10.0
    val result = arithmeticOperationObject.arithmeticOperationOnList(inputList, "Addition")
    assert(result == expectedOutput)
  }
}
