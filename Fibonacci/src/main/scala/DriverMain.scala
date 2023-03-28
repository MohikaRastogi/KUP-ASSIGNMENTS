package com.knoldus

object DriverMain extends App {
  private val fibonacci = new Fibonacci()
  try {
    //if we pass negative number as argument then the method throws an exception which is catched in catch
    println("The 10-th Fibonacci Number is " + fibonacci.findNthNumberInFibonacci(10))
  }
  catch {
    case negativeNumberFound: IllegalArgumentException => println(negativeNumberFound.getMessage)
    //for any other exception that occurs
    case _: Throwable => println("An unknown error occurred.")
  }
}
