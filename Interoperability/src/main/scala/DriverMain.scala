package com.knoldus

/**
 *
 * This is the driver code for the application.
 * It demonstrates the use of the CalculatorOperation and StorageOperations classes.
 */
object DriverMain extends App {
  //instance of CalculatorOperations class  to performbasic functions
  val calculator = new CalculatorOperation()
  println(calculator.add(2, 3)) // Output: 5
  println(calculator.subtract(5, 2)) // Output: 3
  println(calculator.multiply(4, 2)) // Output: 8
  println(calculator.divide(10, 5)) // Output: 2

  //instance of StorageOperations class to perform some storage operations
  val storage = new StorageOperations()
  storage.addElement("Hello")
  storage.addElement(123)
  println(storage.checkIfContains("Hello")) // Output: true
  println(storage.checkIfContains(456)) // Output: false
  storage.removeElement(123)
  println(storage.checkIfContains(123)) // Output: false
  storage.removeAll()
  println(storage.checkIfContains("Hello")) // Output: false
}

