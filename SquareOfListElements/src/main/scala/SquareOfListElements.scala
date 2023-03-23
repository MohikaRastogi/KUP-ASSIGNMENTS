package com.knoldus


import scala.util.Try

object SquareOfListElements extends App {
  //Method one to find the square of each element of list
  def squareList(list: List[Int]): Try[List[Int]] = {
    Try {
      list match {
        case Nil => Nil //if empty list is encountered or list has not element left
        case headElement :: remainingList => headElement * headElement :: squareList(remainingList).get //recursively finding square of each element
      }
    }
  }

  def squareList2(list: List[Int]): Try[List[Int]] = // method 2 to find square using map() method
  {
    Try {
      list.map(listElement => listElement * listElement) // returns a new list
    }
  }
}