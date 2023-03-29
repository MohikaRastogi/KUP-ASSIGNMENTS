#### Session 4 Day 1 Assignment 2
### Problem : Find square root of Each element of list
### scala

Session 4 Day 1 Assignment 2

In a list of numbers return the square root of all the numbers.

Sample Input: List(4, 16, 25, 36)
Sample Output List(2, 4, 5, 6)

#### Solution: 
The computeSquareRoot method takes a list of integers as input and returns a list of doubles, where each double represents the square root of the corresponding integer in the input list. If an integer in the input list is negative, the method returns the minimum value of an integer instead of calculating its square root.

The Try and Success/Failure classes are used to handle exceptions that may be thrown when attempting to calculate the square root of an integer. If an exception is thrown, the computeSquareRoot method returns the minimum value of an integer instead of the square root.

The code is in src/main/scala .
Test file is in test folder 

Learn more about list in scala ->
[Scala List](https://blog.knoldus.com/working-with-lists-in-scala/)


