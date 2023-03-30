package com.knoldus

import scala.util.{Try, Success, Failure}

object DriverMain extends App {
  val arithmeticOperation = new ArithmeticOperation
  val inputList: List[Option[Int]] = List(Some(1), Some(2), Some(3), Some(4))

  val resultAfterAddition = Try(arithmeticOperation.arithmeticOperationOnList(inputList, "Addition"))

  resultAfterAddition match {
    case Success(value) => println(value)
    case Failure(exception) => println(exception)
  }
}
