package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec


class FindElementFromLastTest extends AnyFlatSpec {

  behavior of "FindElementFromLastTest"
  //object of FindElementFromLast class
  val findElementFromLastObject = new FindElementFromLast

  "findKthElementFromLast" should "should return kth element from last in list" in {
    val integerList = List(1, 2, 3, 4, 5, 6)
    val expectedResult = findElementFromLastObject.findKthElementFromLast(integerList, 2).getOrElse("invalid result")
    assert(expectedResult == 5)
  }

  "findKthElementFromLast" should "should return kth element from last in list of string type" in {
    val stringList = List("cat", "fish", "rabbit", "dog", "lion")
    val expectedResult = findElementFromLastObject.findKthElementFromLast(stringList, 4).getOrElse("invalid result")
    assert(expectedResult == "fish")
  }

  "findKthElementFromLast" should "should return kth element from last in Character list" in {
    val characterList = List('a', 'b', 'c', 'd', 'f', 'e', 'f')
    val expectedResult = findElementFromLastObject.findKthElementFromLast(characterList, 3).getOrElse("invalid result")
    assert(expectedResult == 'f')
  }

  "findKthElementFromLast" should "should return error result, if position index passed is greater than length of list" in {
    val integerList = List("cat", "fish", "rabbit", "dog", "lion")
    val expectedResult = findElementFromLastObject.findKthElementFromLast(integerList, 7).getOrElse("empty list or kth position is greater than list size")
    assert(expectedResult == "empty list or kth position is greater than list size")
  }

  "findKthElementFromLast" should "should return error result, if list is empty " in {
    val emptyList = List()
    val expectedResult = findElementFromLastObject.findKthElementFromLast(emptyList, 4).getOrElse("empty list or kth position is greater than list size")
    assert(expectedResult == "empty list or kth position is greater than list size")
  }
}
