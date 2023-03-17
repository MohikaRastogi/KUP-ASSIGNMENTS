package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class ExpandingFunctionsTest extends AnyFunSuite{
  test("test for addExpanded using two integers")
  {
    val result = ExpandingFunctions.addExpanded(2, 3)
    assert(result == 5)
  }
  test("test for sumOfList using list as input ") {
    val result = ExpandingFunctions.sumOfList(List(1, 2, 3, 4, 5))
    assert(result == 15)
  }

  test("test for higherOrderFunctionExpanded ")
  {
    val someFunction: Int => Int = number => number * 2
    val result = ExpandingFunctions.higherOrderFunctionExpanded.apply(someFunction, 4)
    assert(result == 8)
  }

}
