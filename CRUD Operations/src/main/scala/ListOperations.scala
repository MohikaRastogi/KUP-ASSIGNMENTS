package com.knoldus

// @ListOperations is a generic class that extends CRUDOperations
// to implement create,read,update,delete operations for a LIST
class ListOperations[T] extends CRUDOperations[T] {
  var list: List[T] = List.empty[T]

  def create(value: T): List[T] = {
    list = list :+ value
    list
  }

  def read(): List[T] = {
    list
  }

  def update(oldValue: T, newValue: T): List[T] = {
    val maybeIndex = list.indexOf(oldValue)
    // if element is not present in list it will return -1 ,
    // so we cannot update that element which is not present
    if (maybeIndex >= 0) {
      list = list.updated(maybeIndex, newValue)
      list
    }
    else
      list
  }

  def delete(value: T): List[T] = {
    // if list does not contain element to be deleted then return original list.
    if (list.contains(value)) {
      list = list.filterNot(_ == value)
      list
    }
    else
      list

  }
}




