#### Session 4 Day 1 Assignment 3

Define a function that would take a generic list and a number (k) and would return the kth element from the end.

Sample Input: elementKFromEnd(List(1, 2, 3, 4, 5, 6), 2)
Sample Output: 5


##### Solution Description: 

The method findKthElementFromLast[T] takes two parameters, a List of type T(Generic) and an integer positionFromEnd, and returns an Option of type T.
 
    list - A list of type T containing elements.
    positionFromEnd - An integer value representing the position of the element from the end of the list.

If the positionFromEnd is greater than the length of the list or if the list is empty, the method returns None. Otherwise, it computes the index of the element from the end of the list and returns that element using Some()

#### Example
   Suppose you have a list of integers as shown below and you want to find the element at position 2 from the end of the list.
   
   val list = List(1, 2, 3, 4, 5)
   val positionFromEnd = 2

The expected output is -> The element at 2 position from the end is 4

