package com.knoldus

class ArithmeticOperation {
  def arithmeticOperationOnList[T: Numeric](inputList: List[Option[T]], operationType: String): T = {
    if (inputList.isEmpty) {
      throw new IllegalArgumentException("List is empty")
    }
    else {
      val valuesList = for {
        Some(value) <- inputList
      } yield value

      operationType match {
        case "Addition" => valuesList.reduceLeft(Numeric[T].plus)
        case "Subtraction" => valuesList.reduceLeft(Numeric[T].minus)
        case "Multiplication" => valuesList.reduceLeft(Numeric[T].times)
        case _ => throw new IllegalArgumentException("Invalid Operation")
      }
    }
  }
}
