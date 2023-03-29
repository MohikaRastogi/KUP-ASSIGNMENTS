package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class CapitalizeListElementTest extends AnyFlatSpec {

  behavior of "CapitalizeListElementTest"
  val capitalizeListElementObject = new CapitalizeListElement

  "findElementAndCapitalize" should "capitalize all the a's present in the list of strings" in {
    val inputList = List("My", "name", "is", "Michael", "Scott")
    val expectedResult = List("My", "nAme", "is", "MichAel", "Scott")
    assert(capitalizeListElementObject.capitalizeALlAInList(inputList) == expectedResult)
  }

  "findElementAndCapitalize" should "throw an exception if list is empty" in {
    val exceptionResult = intercept[IllegalArgumentException] {
      capitalizeListElementObject.capitalizeALlAInList(List())
    }
    assert(exceptionResult.getMessage == "List is empty")
  }
}
