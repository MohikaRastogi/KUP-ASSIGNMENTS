package com.knoldus

import scala.annotation.tailrec

class LinkedList[T] { //T is a generic data type that can be any type

  class Node(val data: T, var next: Node) //inner class to store data and next node address

  var head: Node = null //head of linked list

  //method to insert element at beginning of list
  def insert(element: T): T = {
    head = new Node(element, head)
    head.data
  }

  def delete(element: T): Option[T] = {
    @tailrec
    def deleteRec(curr: Node, prev: Node): Option[T] = {
      if (curr == null) {
        // Reached the end of the list without finding the node to delete
        None
      } else if (curr.data == element) {
        // Found the node to delete, remove it
        if (prev == null) {
          // Deleting the first node
          head = curr.next
        } else {
          // Deleting a node that is not the first node
          prev.next = curr.next
        }
        Some(curr.data)
      } else {
        // Keep searching for the node to delete
        deleteRec(curr.next, curr)
      }
    }

    deleteRec(head, null)
  }


  def search(element: T): Boolean = {
    @tailrec
    def searchHelper(curr: Node): Boolean = {
      if (curr == null) { // empty list
        false
      } else if (curr.data == element) { //if element is first element of list
        true
      } else { // else move ahead and continue to find
        searchHelper(curr.next)
      }
    }

    searchHelper(head)
  }


  def traverse(): Unit = {
    @tailrec
    def traverseHelper(curr: Node): Unit = {
      if (curr != null) { // print until reached the end of list
        println(curr.data)
        traverseHelper(curr.next)
      }
    }

    traverseHelper(head)
  }

}




