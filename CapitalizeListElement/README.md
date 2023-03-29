#### Session 4 Day 1 Assignment 1
### Problem : Capitalize all A's IN a list
### scala

Write a program to capitalize all 'A's in a list:

Sample input: List("My", "name", "is", "Michael", "Scott")
Sample output: List("My", "nAme", 'is", "MichAel", "Scott")

#### Solution: 
The code in written in scala language. It has a method that accepts a list of strings and returns the updated list.
It uses map method to iterate over each element in the list and then again a map on each list element that iterates over each character of string.
Then we can check if any character is 'a' and convert it to 'A'
else we return that character itself.

if an empty list is passed as an argument to the method it throws an exception.

The code is in src/main/scala .
Test file is in test folder 

Learn more about list in scala ->
[Scala List](https://blog.knoldus.com/working-with-lists-in-scala/)

Learn more about map in scala ->
[Scala Map](https://blog.knoldus.com/map-in-scala/)
