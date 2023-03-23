package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class VehicleCapabilitiesTest extends AnyFunSuite {
  //test case for car
  test("Test for car is driven or not") {
    val car = new Car()
    assert(car.move == "Car can be driven")
  }

  //test case for boat
  test("Test for boat is sailed ") {
    val boat = new Boat()
    assert(boat.move == "Boat can be sailed")
  }

  //test case for aeroplane
  test("Test for aeroplane is flown") {
    val aeroplane = new Aeroplane()
    assert(aeroplane.move == "Aeroplane can be flown")
  }

  //test case for flying car
  test("Test for flying car is driven and flown") {
    val flyingCars = new FlyingCars()
    assert(flyingCars.move == "Flying Cars: can be driven and flown")
  }

  //test case for hovercraft
  test("Hovercraft should be able to be driven and sailed") {
    val hovercraft = new HoverCrafts()
    assert(hovercraft.move == "Hover Crafts: can be sailed and driven")
  }

}
