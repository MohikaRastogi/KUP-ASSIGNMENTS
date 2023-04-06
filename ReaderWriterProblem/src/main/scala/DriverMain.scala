package com.knoldus

import java.util.concurrent.Executors

object DriverMain extends App {

  // Create a thread pool to execute the tasks concurrently
  private val executor = Executors.newFixedThreadPool(4)
  private val readWriteOperation = new ReadWriteOperation

  // Submit tasks to the thread pool
  executor.submit(new Runnable() {
    def run(): Unit = readWriteOperation.readOperation()
  })
  executor.submit(new Runnable() {
    def run(): Unit = readWriteOperation.readOperation()
  })
  executor.submit(new Runnable() {
    def run(): Unit = readWriteOperation.writeOperation()
  })
  executor.submit(new Runnable() {
    def run(): Unit = readWriteOperation.readOperation()
  })
  executor.submit(new Runnable() {
    def run(): Unit = readWriteOperation.readOperation()
  })
  executor.submit(new Runnable() {
    def run(): Unit = readWriteOperation.writeOperation()
  })
  executor.submit(new Runnable() {
    def run(): Unit = readWriteOperation.writeOperation()
  })
  executor.submit(new Runnable() {
    def run(): Unit = readWriteOperation.readOperation()
  })

  // Shutdown the thread pool
  executor.shutdown()
}



