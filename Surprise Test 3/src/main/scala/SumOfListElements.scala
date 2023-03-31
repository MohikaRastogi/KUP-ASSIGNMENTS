package com.knoldus

object SumOfListElements extends App{
  private val list = List(1,2,3,4,5)
  println("sum of list elements is: "+ sumOfElements(list))

  def sumOfElements(list: List[Int]): Int = {
    list match {
      case Nil => 0
      case element :: remainingList => element + sumOfElements(remainingList)
    }
  }
}
