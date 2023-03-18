### Session 2 
### Assignment 4 (Day 2)

Given a typeClass Show, which is used to return a String representation of a particular type.

trait Show[A] { 
 def show(a: A): String 
} 


For example: 

This is the Show implementation for Int type.

 implicit val intShow = new Show[Int] { 
 def show(i: Int) = i.toString 
}

Que: Provide implementations of Show for the following types

a) Long
b) Double
c) case class Position(x: Int, y: Int) its Show implementation should return a string like "Pos(x: 0, y: 1)" for Position(0,1)
