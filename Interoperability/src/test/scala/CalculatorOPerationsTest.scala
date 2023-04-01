package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CalculatorOPerationsTest extends AnyFlatSpec with Matchers {

  "CalculatorOperation" should "add two numbers" in {
    val calculator = new CalculatorOperation
    calculator.add(1, 2) shouldEqual 3
  }

  it should "subtract two numbers" in {
    val calculator = new CalculatorOperation
    calculator.subtract(4, 2) shouldEqual 2
  }

  it should "multiply two numbers" in {
    val calculator = new CalculatorOperation
    calculator.multiply(3, 5) shouldEqual 15
  }

  it should "divide two numbers" in {
    val calculator = new CalculatorOperation
    calculator.divide(10, 2) shouldEqual 5
  }
}

class StorageOperationsSpec extends AnyFlatSpec with Matchers {

  "StorageOperations" should "add an element to the array" in {
    val storage = new StorageOperations
    storage.addElement(1)
    storage.checkIfContains(1) shouldEqual true
  }

  it should "remove an element from the array" in {
    val storage = new StorageOperations
    storage.addElement(1)
    storage.removeElement(1)
    storage.checkIfContains(1) shouldEqual false
  }

  it should "remove all elements from the array" in {
    val storage = new StorageOperations
    storage.addElement(1)
    storage.addElement(2)
    storage.removeAll()
    storage.checkIfContains(1) shouldEqual false
    storage.checkIfContains(2) shouldEqual false
  }
}
