package com.knoldus

//@SequenceOPerations is another class that extends CRUDOperations
//to perform create,read,update,delete operations on sequence
class SequenceOperations[T] extends CRUDOperations[T] {
  var sequence = Seq.empty[T]

  def create(value: T): Seq[T] = {
    sequence = sequence :+ value
    sequence
  }

  def read(): Seq[T] = {
    sequence
  }

  def update(oldValue: T, newValue: T): Seq[T] = {
    val indexOfOldValue = sequence.indexOf(oldValue)

    // if index found > =0 then replace element else return old sequence
    if (indexOfOldValue >= 0) {
      sequence = sequence.updated(indexOfOldValue, newValue)
      sequence
    } else
      sequence
  }

  def delete(value: T): Seq[T] = {
    //only if sequence contains the element to be deleted then we delete else return original list
    if (sequence.contains(value)) {
      sequence = sequence.filterNot(_ == value)
      sequence
    } else
      sequence
  }
}
