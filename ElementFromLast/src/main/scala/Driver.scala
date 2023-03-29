package com.knoldus

object Driver extends App {
  private val findElementFromLastObject = new FindElementFromLast
  private val integerList = List(1, 2, 3, 4, 5, 6)
  //prints 5, as second element from last is 5 in the list
  println(findElementFromLastObject.findKthElementFromLast[Int](integerList, 2).getOrElse("empty list or kth position is greater than list size"))
}
