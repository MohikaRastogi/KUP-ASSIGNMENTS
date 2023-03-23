package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class VehicleTest extends AnyFlatSpec {
  val vehicle = new Vehicle

  //moving vehicle one time = 50 - 20 = 30
  it should "return 30 first time we move the vehicle" in {
    assert(vehicle.move() == 30)
  }

  //moving vehicle second time = 30 - 20 = 10
  it should "return 10 if we move the vehicle two times" in {
    assert(vehicle.move == 10)
  }

  //moving vehicle third time, not enough fuel so refuel and then move: 50 - 20 = 30
  it should "return 30 the third time we move the vehicle: first refuel then move" in {
    assert(vehicle.move == 30)
  }

  // at any time refuel vehicle : 50
  it should "return 50 if we fill fuel " in {
    assert(vehicle.fillFuel == 50)
  }


}
