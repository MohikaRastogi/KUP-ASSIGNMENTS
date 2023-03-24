package com.knoldus

// @CRUDOperations is a generic abstract class that has methods
// to create update delete or read A SEQUENCE and its subtypes.
abstract class CRUDOperations[T] {

  // @create to create a list/sequence accepts a value of any(generic) type
  // and returns that updated sequence/list
  def create(value: T): Seq[T]

  def read(): Seq[T]


  //@update take two parameters @oldValue is parameter to be relaced by @newValue
  //returns an updated sequence or class
  def update(oldValue: T, newValue: T): Seq[T]

  //delete a particular element and returns updated list/sequence
  def delete(value: T): Seq[T]
}



