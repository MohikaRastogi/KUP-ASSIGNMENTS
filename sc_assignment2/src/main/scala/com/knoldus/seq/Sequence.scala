package com.knoldus.seq


class Sequence {

  private var sequenceString: Seq[String] = Seq.empty[String]
  private var sequenceInt: Seq[Int] = Seq.empty[Int]

  // Check the type of element, if it is int save it to sequenceInt, if it is string save it to sequenceString, else return IllegalArgumentException,  return the size
  def store(element: Any): Int = {
    element match {
      case valueInteger: Int => sequenceInt = sequenceInt :+ valueInteger
        sequenceInt.size
      case valueString: String => sequenceString = sequenceString :+ valueString
        sequenceString.size
      case _ => throw new IllegalArgumentException
    }
  }


  // Check the type of element, if it is int remove it from sequenceInt, if it is string remove it from sequenceString, else return IllegalArgumentException,  return the size
  def removeElement(element: Any): Int = {
    element match {
      case intElement: Int => if (sequenceInt.contains(intElement)) {
        sequenceInt = sequenceInt.filterNot(_ == intElement)
        sequenceInt.size
      }
      else
        throw new IllegalArgumentException

      case stringElement: String => if (sequenceString.contains(stringElement)) {
        sequenceString = sequenceString.filterNot(_ == stringElement)
        sequenceString.size
      }
      else
        throw new IllegalArgumentException

      case _ => throw new IllegalArgumentException
    }
  }
}
