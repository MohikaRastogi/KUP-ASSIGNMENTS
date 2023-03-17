##Session 2
##Assignment 1[DAY 2]

###Consider a function that squares all elements of a list and returns a list with the results. Complete the following two equivalent definitions of


squareList

def squareList(list: List[Int]): List[Int] =
 list match {
   case Nil => ??
   case  h:: t => ??
}

def squareList(list: List[Int]): List[Int] =
list map ??
