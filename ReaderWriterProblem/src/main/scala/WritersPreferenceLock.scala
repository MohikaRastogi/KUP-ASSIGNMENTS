package com.knoldus

import java.util.concurrent.locks.ReentrantReadWriteLock

class WritersPreferenceLock {
  private val lock = new ReentrantReadWriteLock(true)

  def readLock(): Unit = lock.readLock().lock()

  def readUnlock(): Unit = lock.readLock().unlock()

  def writeLock(): Unit = lock.writeLock().lock()

  def writeUnlock(): Unit = lock.writeLock().unlock()
}
