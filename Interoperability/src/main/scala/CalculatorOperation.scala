package com.knoldus

/**
 * Provides methods to perform arithmetic operations using the `Calculator` class.
 */
class CalculatorOperation {

  def add(numberOne: Int, numberTwo: Int): Int = Calculator.add(numberOne, numberTwo)

  def subtract(numberOne: Int, numberTwo: Int): Int = Calculator.subtract(numberOne, numberTwo)

  def multiply(numberOne: Int, numberTwo: Int): Int = Calculator.multiply(numberOne, numberTwo)

  def divide(numberOne: Int, numberTwo: Int): Int = Calculator.divide(numberOne, numberTwo)
}


