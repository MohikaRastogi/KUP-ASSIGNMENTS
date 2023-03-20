package com.knoldus

object Sorting {
  def selectionSort(list: List[Int]): List[Int] = {
    def findMinimumElement(list: List[Int], minimumElement: Int): Int = {
      if (list.isEmpty)
        minimumElement
      else if (list.head < minimumElement)
        findMinimumElement(list.tail, list.head)
      else findMinimumElement(list.tail, minimumElement)
    }

    def extractMinimumElement(list: List[Int], minimumElement: Int): List[Int] = {
      list match {
        case Nil => Nil
        case head :: tail =>
          if (head == minimumElement) extractMinimumElement(tail, minimumElement)
          else head :: extractMinimumElement(tail, minimumElement)
      }
    }

    if (list.isEmpty) Nil
    else {
      val min = findMinimumElement(list, Int.MaxValue)
      val remainingList = extractMinimumElement(list, min)
      min :: selectionSort(remainingList)
    }
  }
}
