package com.knoldus


import org.scalatest.funsuite.AnyFunSuite

class ElectricityChargesTest extends AnyFunSuite {
  test("Test Case to compute bill based on sample input") {
    val bill1 = ElectricityCharges(1001, "user1", "Delhi", 5062, 5904) // test case given in problem definition
    assert(bill1.computeFinalBillWithGST() == 7073.51)
  }
  test("Test case if units consumed are less than 250") {
    val bill2 = ElectricityCharges(1002, "user2", "Mumbai", 200, 350) //general test case
    assert(bill2.computeFinalBillWithGST() == 929.25)
  }
  test("test case if unit consumed are greater than 450 ") {
    val bill3 = ElectricityCharges(1003, "user3", "Bangalore", 400, 900) //general test case
    assert(bill3.computeFinalBillWithGST() == 3643.25)
  }
  test("Test case if unit consumed are 0") {
    val bill4 = ElectricityCharges(1004, "user4", "Chennai", 200, 200) //test case for units consumed = 0
    assert(bill4.computeFinalBillWithGST() == 0.0)
  }
  test("Test case if unit consumed are negative, cannot happen so error ") {
    val bill5 = ElectricityCharges(1005, "user5", "Delhi", 300, 200) //test case for exception handling
    assert(bill5.computeFinalBillWithGST() == 0.0)
  }

}
