package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class SequenceOperationsTest extends AnyFlatSpec {

  behavior of "SequenceOperationsTest"

  it should "create a new Sequence" in {
    val seqObject = new SequenceOperations[Int]()
    assert(seqObject.create(1) === Seq(1))
    assert(seqObject.create(2) === Seq(1, 2))
  }

  it should "read all elements" in {
    val seqObject = new SequenceOperations[String]()
    assert(seqObject.read() === Seq.empty[String])

    seqObject.create("Nash Tech")
    seqObject.create("Knoldus")
    assert(seqObject.read() === Seq("Nash Tech", "Knoldus"))
  }


  it should "update" in {
    val seqObject = new SequenceOperations[Double]()
    seqObject.create(1.0)
    seqObject.create(2.0)
    seqObject.create(3.0)

    assert(seqObject.update(2.0, 2.5) === Seq(1.0, 2.5, 3.0))
    assert(seqObject.update(4.0, 4.5) === Seq(1.0, 2.5, 3.0))
  }


  it should "delete required element " in {
    val seqObject = new SequenceOperations[Char]()
    seqObject.create('a')
    seqObject.create('e')
    seqObject.create('i')
    seqObject.create('m')
    seqObject.create('o')
    seqObject.create('u')

    assert(seqObject.delete('m') === Seq('a', 'e', 'i', 'o' , 'u'))
    assert(seqObject.delete('m') === Seq('a', 'e', 'i', 'o' , 'u'))
  }

}
