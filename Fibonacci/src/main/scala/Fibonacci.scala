package com.knoldus

import scala.annotation.tailrec

class Fibonacci {

  // findNthNumberInFibonacci is a tail recursive
  // method that accepts Nth number as argument and previousValue,nextValue are fields that
  // stores the previous and current value as accumulators for next value computation and it return an integer value
  @tailrec
  final def findNthNumberInFibonacci(nthNumber: Int, previousValue: Int = 0, nextValue: Int = 1): Int = {
    if (nthNumber < 0)
      throw new IllegalArgumentException("nthNumber must be a positive Integer")
    else {
      nthNumber match {
        case 0 => previousValue
        case 1 => nextValue
        case _ => findNthNumberInFibonacci(nthNumber - 1, nextValue, previousValue + nextValue)
      }
    }
  }
}






