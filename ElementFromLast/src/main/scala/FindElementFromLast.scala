package com.knoldus

class FindElementFromLast {
  // This method takes a List of type T and an integer positionFromEnd, and returns an Option of type T.
  def findKthElementFromLast[T](list: List[T], positionFromEnd: Int): Option[T] = {
    //if position is greater than list length or if list is empty returns None
    if (positionFromEnd > list.length || list.isEmpty)
      None
    // else compute the index of element and return that element
    else {
      val getIndex = list.length - positionFromEnd
      Some(list(getIndex))
    }
  }
}
