package com.knoldus

// Abstract class defining different types of equality and inequality operators
abstract class EqualityInequalityOperators {
  def useOfEquals[T](valueOne: T, valueTwo: T): Boolean

  def useOfDoubleEqual[T](valueOne: T, valueTwo: T): Boolean

  def useOfNotEqualsTo[T](valueOne: T, valueTwo: T): Boolean

  def useOfNE[T <: AnyRef](valueOne: T, valueTwo: T): Boolean

  def useOfEQ[T <: AnyRef](valueOne: T, valueTwo: T): Boolean
}

// Implementation of the abstract class with actual code for the different operator
class CompareDifferentEqualityInequalityOperator extends EqualityInequalityOperators {
  def useOfEquals[T](valueOne: T, valueTwo: T): Boolean = {
    valueOne.equals(valueTwo)
  }

  def useOfDoubleEqual[T](valueOne: T, valueTwo: T): Boolean = {
    valueOne == valueTwo
  }

  def useOfNotEqualsTo[T](valueOne: T, valueTwo: T): Boolean = {
    valueOne != valueTwo
  }

  def useOfNE[T <: AnyRef](valueOne: T, valueTwo: T): Boolean = {
    valueOne.ne(valueTwo)
  }

  def useOfEQ[T <: AnyRef](valueOne: T, valueTwo: T): Boolean = {
    valueOne.eq(valueTwo)
  }
}
