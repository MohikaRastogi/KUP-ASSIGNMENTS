package com.knoldus

object DriverMain extends App {

    private val readWriteOperation = new ReadWriteOperation

    // Create threads for each read and write operation
    private val reader1 = new Thread(() => readWriteOperation.readOperation(), "Reader1")

    private val reader2 = new Thread(() => readWriteOperation.readOperation(), "Reader2")

    private val writer1 = new Thread(() => readWriteOperation.writeOperation(), "Writer1")

    private val reader3 = new Thread(() => readWriteOperation.readOperation(), "Reader3")

    private val reader4 = new Thread(() => readWriteOperation.readOperation(), "Reader4")

  private val writer2 = new Thread(() => readWriteOperation.writeOperation(), "Writer2")

  private val writer3 = new Thread(() => readWriteOperation.writeOperation(), "Writer3")

    private val reader5 = new Thread(() => readWriteOperation.readOperation(), "Reader5")

    // Start the threads
    reader1.start()
    reader2.start()
    writer1.start()
    reader3.start()
    reader4.start()
    writer2.start()
    writer3.start()
    reader5.start()
  }


