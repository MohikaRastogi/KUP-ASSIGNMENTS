package com.knoldus

object DriverMain extends App {
  private val comparisionEquality = new CompareDifferentEqualityInequalityOperator
  // Using 'equals' method
  private val wordOne = "hello"
  private val wordTwo = "world"
  private val wordThree = "hello"

  println(comparisionEquality.useOfEquals(wordOne, wordTwo)) // false
  println(comparisionEquality.useOfEquals(wordTwo, wordThree)) // true

  // Using '==' comparisionEquality
  private val numberOne = 42
  private val numberTwo = 42
  private val numberThree = 3

  println(comparisionEquality.useOfDoubleEqual(numberOne, numberTwo)) // true
  println(comparisionEquality.useOfDoubleEqual(numberOne, numberThree)) // false

  // Using '!=' comparisionEquality
  println(comparisionEquality.useOfNotEqualsTo(numberOne, numberTwo)) // false
  println(comparisionEquality.useOfNotEqualsTo(numberOne, numberThree)) // true

  // Using 'ne' method
  private val listOne = List(1, 2, 3)
  private val listTwo = List(1, 2, 3)
  private val listThree = listOne

  println(comparisionEquality.useOfNE(listOne, listTwo)) // true
  println(comparisionEquality.useOfNE(listOne, listThree)) // false

  // Using 'eq' method on same listOne, listTwo, listThree

  println(comparisionEquality.useOfEQ(listOne, listTwo)) // false
  println(comparisionEquality.useOfEQ(listOne, listThree)) // true
}
