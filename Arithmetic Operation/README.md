#### Session 4 Day 1 Assignment 4
#### scala
#### Problem: Perform Arithmetic Operation on A generic List


Write a function that takes a list of Option of numbers and performs some arithmetic operation ("Addition", "Subtraction", "Multiplication") passed to the function by the user.
Hint: First convert List[Option[T]] to List[T] (use for expressions for this) and then perform the arithmetic function over it (make use of Pattern Matching for this). 

######   Sample Input: methodName((List(Some(1), Some(2), Some(3), Some(4)), "Addition")
######   Sample Output: 10


#### Solution Description: 

The code contains a class that has methods to perform arithmetic operations on a list of numeric values.

The arithmeticOperationOnList method of the ArithmeticOperation class takes two parameters: a list of optional numeric values and a string representing the type of arithmetic operation to be performed.

If the input list is empty, an IllegalArgumentException is thrown with the message "List is empty". If an invalid operation is specified, an IllegalArgumentException is thrown with the message "Invalid Operation".

The method returns the result of the specified arithmetic operation on the list of numeric values. The arithmetic operations that can be performed are addition, subtraction, and multiplication.
 
 to learn more about for expression follow this link ->
###### [Learn more about for expressions](https://blog.knoldus.com/terraform-loops-with-for-expressions/)

to learn morre about pattern matching ->
[pattern matching](https://blog.knoldus.com/how-to-use-pattern-matching/)
