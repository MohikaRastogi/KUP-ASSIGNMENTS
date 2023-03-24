package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec


class ListOperationsTest extends AnyFlatSpec {

  "A ListOperations" should "be able to create a new item" in {
    val listObject = new ListOperations[Int]()
    assert(listObject.create(1) === List(1))
    assert(listObject.create(2) === List(1, 2))
  }

  it should "be able to read all items" in {
    val listObject = new ListOperations[String]()
    assert(listObject.read() === List.empty[String])

    listObject.create("knoldus")
    listObject.create("Nash Tech")
    assert(listObject.read() === List("knoldus", "Nash Tech"))
  }

  it should "be able to update an existing item" in {
    val listObject = new ListOperations[Double]()
    listObject.create(1.0)
    listObject.create(2.0)
    listObject.create(3.0)

    //will replace 2 with 2.5
    assert(listObject.update(2.0, 2.5) === List(1.0, 2.5, 3.0))

    //as 4.0 is not present in the list it will not update the list and return original list
    assert(listObject.update(4.0, 4.5) === List(1.0, 2.5, 3.0))
  }

  it should "be able to delete an existing item" in {
    val listObject = new ListOperations[Char]()
    listObject.create('a')
    listObject.create('b')
    listObject.create('c')

    assert(listObject.delete('b') === List('a', 'c'))

    // d is not present in the list so will return updated list
    assert(listObject.delete('d') === List('a', 'c'))
  }

}
