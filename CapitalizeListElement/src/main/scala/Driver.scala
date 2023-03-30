package com.knoldus

import scala.util.{Failure, Success, Try}

object Driver extends App {
  private val capitalizeListElementObject = new CapitalizeListElement
  private val inputList = List("My", "name", "is", "Michael", "Scott")


  //result can be success if list is not empty amd arguments are correct,
  // it will throw an exception if list is empty, hence Failure
  private val result = Try(capitalizeListElementObject.capitalizeALlAInList(inputList))
  result match {
    case Success(value) => println(value)
    case Failure(exception) => println(exception)
  }
}
