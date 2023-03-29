package com.knoldus

class CapitalizeListElement {
  //capitalizeALlAInList is a method that accepts list of strings as a parameter and returns the
  //list with all a's capitalized
  def capitalizeALlAInList(stringsList: List[String]): List[String] = {
    //if list is empty, nothing to capitalize so throwing an error
    //map cannot be applied on an empty list
    if (stringsList.isEmpty) {
      throw new IllegalArgumentException("List is empty")
    }
    else {
      //else iterate on each element and then again iterate
      // on each character value of that element and if found any a then capitalize it
      stringsList.map(stringvalue => stringvalue.map(charvalue =>
        if (charvalue == 'a')
          charvalue.toUpper
        else
          charvalue
      ))
    }
  }
}



