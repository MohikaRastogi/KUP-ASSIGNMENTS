package com.knoldus

import scala.math.sqrt
import scala.util.{Try, Success, Failure}

class SquareRoot {
  //computeSquareRoot is a method that takes list of numbers as input and
  // returns a list that contains square root of these numbers
  def computeSquareRoot(listOfNumbers: List[Int]): List[Double] = {

    //flatmap is used as method may return result as Some but we need a List, so it flattens the result
    listOfNumbers.flatMap(number =>
      //check number to be non-negative
      if(number >= 0) {
        Try(sqrt(number)) match {
          case Success(result) => Some(result)
          case Failure(_) => Some(Int.MinValue)
      }
      }
      else {
        //in case of negative number return minimum value of Integer
        Some(Int.MinValue)
      }
    )
  }
}


