package com.knoldus

import org.scalatest.funsuite.AnyFunSuite
import scala.util.Success

class SquareOfListElementsTest extends AnyFunSuite
{

  test("Square of list elements using squareList")
  {
    assert(SquareOfListElements.squareList(List(1, 2, 3)) == Success(List(1, 4, 9)))
    assert(SquareOfListElements.squareList(Nil) == Success(Nil))
  }

  test("Square of list elements using squareList2")
  {
    assert(SquareOfListElements.squareList2(List(1, 2, 3)) == Success(List(1, 4, 9)))
    assert(SquareOfListElements.squareList2(Nil) == Success(Nil))
  }
}



