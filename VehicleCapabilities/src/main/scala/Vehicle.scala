package com.knoldus

import scala.util.{Try, Success, Failure}


//vehicle
trait Vehicle
{
  def move(): String            //abstract method
}

trait Driven extends Vehicle
{
  def drive(): String = "driven"   //concrete method
}

trait Sailed extends Vehicle
{
  def sail(): String = "sailed"
}

trait Flown extends Vehicle
{
  def fly(): String = "flown"
}

//car is a class which extends a trait named Driven
class Car extends Driven
{
  override def move(): String = s"Car can be ${drive}"    //overriding move method of Vehicle trait
}

class Boat extends Sailed
{
  override def move(): String = s"Boat can be ${sail}"
}

class Aeroplane extends Flown
 {
  override def move(): String = s"Aeroplane can be ${fly}"
}

class FlyingCars extends Driven with Flown {
  override def move(): String = s"Flying Cars: can be $drive and $fly"
}

class HoverCrafts extends Driven with Sailed
{
  override def move(): String = s"Hover Crafts: can be $sail and $drive"
}

object VehicleCapabilities extends App // creating singleton object
{
  //instances of different classes
  val car = new Car()
  val boat = new Boat()
  val aeroplane = new Aeroplane()
  val flyingCar = new FlyingCars()
  val hovercraft = new HoverCrafts()

  //exception handling using Try
  val resultForCar = Try(car.move)
  resultForCar match
  {
    case Success(resultForCar) => resultForCar
    case Failure(exception) => exception.getMessage
  }

  val resultForBoat = Try(boat.move)
  resultForBoat match
  {
    case Success(resultForBoat) => resultForBoat
    case Failure(exception) => exception.getMessage
  }

  val resultForAeroplane = Try(aeroplane.move)
  resultForAeroplane match
  {
    case Success(resultForAeroplane) => resultForAeroplane
    case Failure(exception) => exception.getMessage
  }

  val resultForFlyingCars = Try(flyingCar.move)
  resultForFlyingCars match
  {
    case Success(resultForFlyingCars) => resultForFlyingCars
    case Failure(exception) => exception.getMessage
  }

  val resultForHoverCrafts = Try(hovercraft.move)
  resultForHoverCrafts match
  {
    case Success(resultForHoverCrafts) => resultForHoverCrafts
    case Failure(exception) => exception.getMessage
  }
}