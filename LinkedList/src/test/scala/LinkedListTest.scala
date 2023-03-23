package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class LinkedListTest extends AnyFlatSpec {

  "A LinkedList" should "insert elements at the head" in {
    val list = new LinkedList[Int]
    assert(list.insert(3) == 3)
    assert(list.insert(5) == 5)
    assert(list.insert(7) == 7)
  }

  it should "delete elements from the list" in {
    val list = new LinkedList[Int]
    list.insert(3)
    list.insert(5)
    list.insert(7)
    list.delete(5)
    assert(!list.search(5)) //should return false as 5 is deleted
    assert(list.delete(87) == None) //element is not present to delete, so none

  }

  it should "search for elements in the list" in {
    val list = new LinkedList[Int]
    list.insert(3)
    list.insert(5)
    list.insert(7)
    assert(list.search(5))
    assert(list.search(7))
    assert(list.search(3))
    assert(!list.search(10))
  }

  it should "traverse the list and print the elements" in {
    val list = new LinkedList[Int]
    list.insert(3)
    list.insert(5)
    list.insert(7)
    val output = new java.io.ByteArrayOutputStream()
    Console.withOut(output) {
      list.traverse()
    }
    assert(output.toString == "7\n5\n3\n")
  }

  //test cases for String type LinkedList

  "insert" should "insert elements to the list" in {
    val list = new LinkedList[String]
    assert(list.insert("abc") == "abc")
    assert(list.insert("def") == "def")
    assert(list.insert("ghi") == "ghi")
  }

  it should "insert elements in reverse order" in {
    val list = new LinkedList[String]
    assert(list.insert("ghi") == "ghi")
    assert(list.insert("def") == "def")
    assert(list.insert("abc") == "abc")
  }

  "delete" should "delete elements from the list" in {
    val list = new LinkedList[String]
    list.insert("abc")
    list.insert("def")
    list.insert("ghi")
    assert(list.delete("def") == Some("def"))
    assert(list.search("def") == false)
    assert(list.delete("ghi") == Some("ghi"))
    assert(list.delete("abc") == Some("abc"))
    assert(list.delete("xyz") == None)
  }

  "search" should "return true if the element exists in the list" in {
    val list = new LinkedList[String]
    list.insert("abc")
    list.insert("def")
    list.insert("ghi")
    assert(list.search("def") == true)
    assert(list.search("xyz") == false)
  }

  it should "traverse the list and print all the elements in order" in {
    val list = new LinkedList[String]
    list.insert("hello")
    list.insert("world")
    val output = new java.io.ByteArrayOutputStream()
    Console.withOut(output) {
      list.traverse()
    }
    assert(output.toString == "world\nhello\n")
  }

  //tests for Long Type


  "A LinkedList" should "insert elements correctly" in {
    val list = new LinkedList[Long]()
    assert(list.insert(1L) == 1L)
    assert(list.insert(2L) == 2L)
    assert(list.insert(3L) == 3L)
  }

  it should "delete elements correctly" in {
    val list = new LinkedList[Long]()
    list.insert(1L)
    list.insert(2L)
    list.insert(3L)
    assert(list.delete(2L) == Some(2L))
    assert(list.delete(2L) == None)
    assert(list.delete(1L) == Some(1L))
    assert(list.delete(3L) == Some(3L))
  }

  it should "search elements correctly" in {
    val list = new LinkedList[Long]()
    list.insert(1L)
    list.insert(2L)
    list.insert(3L)
    assert(list.search(2L) == true)
    assert(list.search(4L) == false)
  }

  it should "traverse elements correctly" in {
    val list = new LinkedList[Long]()
    list.insert(1L)
    list.insert(2L)
    list.insert(3L)
    val stream = new java.io.ByteArrayOutputStream()
    Console.withOut(stream) {
      list.traverse()
    }
    assert(stream.toString == "3\n2\n1\n")
  }

}



