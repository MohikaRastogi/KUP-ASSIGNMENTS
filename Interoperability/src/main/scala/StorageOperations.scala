package com.knoldus

trait StorageOps {
  def addElement[T](element: T): Unit

  def removeElement[T](element: T): Unit

  def removeAll(): Unit

  def checkIfContains[T](element: T): Boolean
}

class StorageOperations extends StorageOps {
  val storage = new Storage(10)

  override def addElement[T](element: T): Unit = {
    storage.addElement(element)
  }

  override def removeElement[T](element: T): Unit = {
    storage.removeElement(element)
  }

  override def removeAll(): Unit = {
    storage.removeAll()
  }

  override def checkIfContains[T](element: T): Boolean = {
    storage.checkIfContains(element)
  }
}
