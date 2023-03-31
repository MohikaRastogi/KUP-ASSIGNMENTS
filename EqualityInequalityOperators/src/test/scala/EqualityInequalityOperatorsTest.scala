package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class EqualityInequalityOperatorsTest extends AnyFlatSpec {

  behavior of "EqualityInequalityOperatorsTest"

  it should "useOfEQ returns true for same instance of list" in {
    val comparisionEquality = new CompareDifferentEqualityInequalityOperator
    val listOne = List(1, 2, 3)

    assert(comparisionEquality.useOfEQ(listOne, List(1, 2, 3)) == false)
    assert(comparisionEquality.useOfEQ(listOne, listOne) == true)
  }

  it should "useOfNotEqualsTo returns true for different numbers and false for equal numbers" in {
    val comparisionEquality = new CompareDifferentEqualityInequalityOperator

    assert(comparisionEquality.useOfNotEqualsTo(42, 42) == false)
    assert(comparisionEquality.useOfNotEqualsTo(42, 3) == true)
  }

  it should "useOfEquals returns true for equal strings and false for different strings" in {
    val comparisionEquality = new CompareDifferentEqualityInequalityOperator

    assert(comparisionEquality.useOfEquals("hello", "world") == false)
    assert(comparisionEquality.useOfEquals("world", "world") == true)
  }

  it should "useOfDoubleEqual returns true for equal numbers and false for different numbers" in {
    val comparisionEquality = new CompareDifferentEqualityInequalityOperator

    assert(comparisionEquality.useOfDoubleEqual(42, 42) == true)
    assert(comparisionEquality.useOfDoubleEqual(42, 3) == false)
  }

  it should "useOfNE returns true for different lists and false for same lists" in {
    val comparisionEquality = new CompareDifferentEqualityInequalityOperator
    val listOne = List(1, 2, 3)
    val listTwo = listOne
    assert(comparisionEquality.useOfNE(List(1, 2, 3), List(1, 2, 4)) == true)
    assert(comparisionEquality.useOfNE(listOne, listTwo) == false)
  }
}
