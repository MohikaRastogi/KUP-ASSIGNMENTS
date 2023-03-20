package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class SortingTest extends AnyFunSuite {
    test("test for empty list as input") {
      assert(Sorting.selectionSort(List()) === List())
    }

    test("test for list with only one element") {
      assert(Sorting.selectionSort(List(42)) === List(42))
    }

    test("test for list of many elements to be sorted") {
      assert(Sorting.selectionSort(List(3, 1, 4, 5, 9, 2, 6)) === List(1, 2, 3, 4, 5, 6, 9))
    }

  }



