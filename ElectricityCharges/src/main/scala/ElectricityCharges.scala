package com.knoldus


case class ElectricityCharges(accountNumber: Int, accountUsername: String, address: String, previousUnit: Double, currentUnit: Double) {

  def computeFinalBillWithGST(): Double = //function to compute final bill including gst
  {
    try //try catch for exception handling
    {

      val unitsConsumed = currentUnit - previousUnit
      if (unitsConsumed < 0)
        throw new IllegalArgumentException("Units Consumed Cannot be Zero")
      val unitSlab1 = 250.0
      val unitSlab2 = 450.0
      val GSTCharges = 0.18
      val bill = computeBillBasedOnSlabPrice(unitsConsumed, unitSlab1, unitSlab2)
      bill + (GSTCharges * bill)
    }
    catch {
      case unitCannotBeNegative: IllegalArgumentException => println(s"Error: ${unitCannotBeNegative.getMessage}")
        0.0

      case defaultError: Exception => println(s"Some error occurred: ${defaultError.getMessage}")
        0.0
    }
  }


  def computeBillBasedOnSlabPrice(unitsConsumed: Double, unitSlab1: Double, unitSlab2: Double): Double = { //function to compute bill as per units consumed and slabs

    if (unitsConsumed >= 0 && unitsConsumed <= unitSlab1)
      5.25 * unitsConsumed

    else if (unitsConsumed > unitSlab1 && unitsConsumed <= unitSlab2)
      (unitsConsumed - unitSlab1) * 6.75 + (unitSlab1 * 5.25)

    else
      (unitsConsumed - 450) * 8.50 + (6.75 * (unitSlab2 - unitSlab1)) + (5.25 * unitSlab1)
  }

}

