package com.knoldus

class ReadWriteOperation {
  private val lock = new WritersPreferenceLock()
  private var sharedResource = List.empty[Int]

  def readOperation(): Unit = {
    lock.readLock()
    try {
      println(s"Reader ${Thread.currentThread().getName} is reading the shared resource: $sharedResource")
      Thread.sleep(1000)
    } finally {
      lock.readUnlock()
    }
  }

  def writeOperation(): Unit = {
    lock.writeLock()
    try {
      println(s"Writer ${Thread.currentThread().getName} is updating the shared resource")
      sharedResource = sharedResource :+ sharedResource.length
      Thread.sleep(1000)
    } finally {
      lock.writeUnlock()
    }
  }
}
