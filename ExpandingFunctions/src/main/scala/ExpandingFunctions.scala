package com.knoldus


import scala.util.{Try, Success, Failure}

object ExpandingFunctions {

  //First function to expand
  // private val add: (Int, Int) => Int = (num1: Int, num2: Int) => num1 + num2


  val addExpanded: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    def apply(num1: Int, num2: Int): Int = num1 + num2
  }

  ///second function to expand
  //val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum

  val sumOfList: Function1[List[Int], Int] = new Function1[List[Int], Int] {
    def apply(list: List[Int]): Int = list.sum
  }

  //third function to expand
  // val higherOrderFunction: (Int => Int, Int) => Int = (f: (Int => Int), num : Int) => f(num)

  val higherOrderFunctionExpanded: Function2[Function1[Int, Int], Int, Int] = new Function2[Function1[Int, Int], Int, Int] {
    def apply(someFunction: Function1[Int, Int], number: Int): Int = {
      someFunction(number)
    }
  }
}
