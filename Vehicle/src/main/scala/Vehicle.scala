package com.knoldus

class Vehicle {
  val fuelCapacity: Int = 50
  var currentFuel: Int = fuelCapacity

  def move(): Int = {
    if (currentFuel >= 20) { //if there is suffice fuel to move the vehicle
      currentFuel = currentFuel - 20
      currentFuel
    }
    else { //is fuel is less and we need to move we must refuel vehicle
      fillFuel()
      currentFuel = currentFuel - 20
      currentFuel
    }

  }

  def fillFuel(): Int = {
    currentFuel = fuelCapacity //if refueling, value will be 50 each time
    currentFuel
  }

}
