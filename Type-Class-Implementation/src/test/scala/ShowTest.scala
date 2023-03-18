package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class ShowTest extends AnyFunSuite
{

    test("show method for long type")
    {
      assert(Show.showLong.show(12345L) == "12345")
    }

    test("show method for double type") {
      assert(Show.doubleShow.show(12.345) == "12.345")
    }

    test("show method for Position Case-Class  type") {
      val position = Position(0, 1)            //reference to case class
      assert(Show.positionShow.show(position) == "Pos(x: 0, y: 1)")
    }
}
