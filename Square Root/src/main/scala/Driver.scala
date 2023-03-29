package com.knoldus

//driver code for SquareRoot
object Driver extends App {
  private val squareRootObject = new SquareRoot
  private val list: List[Int] = List(4, 16, 25, 36)
  //prints List(2.0, 4.0, 5.0, 6.0)
  println(squareRootObject.computeSquareRoot(list))

}
