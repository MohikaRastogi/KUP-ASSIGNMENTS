## session 2
### ASSIGNMENT 2 [DAY 1]




Scala is a functional language in that functions are first-class values. Scala is also an object-oriented language in that every value is an object. It follows that functions are objects in Scala. For instance, a function from type String to type Int is represented as an instance of the trait Function1[String, Int]. The Function1 trait is defined as follows.

package scala
trait Function1[-A, +B] {
def apply(x: A): B
}

Consider the Scala code
val plus1: (Int => Int) = (num: Int) => num + 1
plus1(2)

This is expanded into the following object code.
val plus1: Function1[Int, Int] = new Function1[Int, Int] { 
def apply(num: Int): Int = num + 1
 }
plus1.apply(2)

Now for the Exercise implement the following functions and expand them:

val add: (Int, Int) => Int = (num1: Int, num2: Int) => num1 + num2
val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum

val higherOrderFunction: (Int => Int, Int) => Int = (f: (Int => Int), num : Int) => f(num)
