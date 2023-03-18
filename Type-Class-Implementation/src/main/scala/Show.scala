package com.knoldus
//Show is a trait that accepts argument of generic type
//or it is a type class
trait Show[A]
{
  def show(a: A): String        //abstract method
}

//declaring case class for position
case class Position(xCoordinate: Int, yCoordinate: Int)
object Show
{
  val showLong = new Show[Long]
  {
    def show(longValue: Long): String = longValue.toString //show for long type
  }


  val doubleShow = new Show[Double]
  {
    def show(doubleValue: Double): String = doubleValue.toString //show for double type
  }


  val positionShow = new Show[Position]
  {                                                ///show for Position class
    def show(position: Position): String = s"Pos(x: ${position.xCoordinate}, y: ${position.yCoordinate})"
  }
}