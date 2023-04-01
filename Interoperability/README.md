##### Session 4 Day 4 Assignment 2

##### Interoperability Between Java And Scala

##### Question:
Create an sbt project which will contain both java and scala code. Inside java, create two classes as follows -
    a. first one, 'calculator' class containing 4 methods, add, substract, multiply and divide. (Ensure to handle all types of cases).
    b. second class, 'storage' class, which just contains an array used to store elements. This class will contains several methods as well i.e. addElement, removeElement, removeAll, checkIfContains.

In Scala, implement the followings -
    a. Create a class exposing all the methods of 'calculator' class.
    b. Create a trait containing the methods defition only and create a new class extending the traits and these override methods will call the 'storage' class methos to perform operations.
    
   
##### DESCRIPTION: 
This is a project that contains two classes in Java: Calculator and Storage. Calculator provides basic arithmetic operations such as addition, subtraction, multiplication, and division, while Storage provides functionality for adding and removing elements from an array and checking if an element is present in the array. In addition, there are two classes in Scala: CalculatorOpsImpl which exposes the methods of the Calculator class, and StorageOpsImpl which extends a trait StorageOps that defines methods for the Storage class and calls those methods to perform operations.







