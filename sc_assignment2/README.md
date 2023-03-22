## provide implementation of  MAP class,Set class and SEQUENCE CLASS in scala accordint to the methods given in each classes.

#### Map class

class MapClass 
  private var mapStorage: Map[String, String] = Map.empty[String, String]
  
  // store the new map key-values in  storage, already defined,  return the size
  def store(map: Map[String, String]): Int = ???

  //simply get the value for a given key from storage
  def getValue(key: String): String = ??? .......
  
#### Set class

class SetClass {

  private var set = Set.empty[Int]

  // Add element into set,  return the size
  def addElement(elem: Int): Int = ???

  // add the elements of the list to the set,  return the size
  def addElement(elements: List[Int]): Int = ???

  // get all the subsets of the set(db), make sure to check the types.
  def getSubSetList: List[List[Int]] = ??? ....... 
  
#### Seq class

class Sequence {

  private var sequenceString: Seq[String] = Seq.empty[String]
  private var sequenceInt: Seq[Int] = Seq.empty[Int]

  // Check the type of element, if it is int save it to sequenceInt, if it is string save it to sequenceString, else return IllegalArgumentException,  return the size
  def store(element: Any): Int = ???

  // Check the type of element, if it is int remove it from sequenceInt, if it is string remove it from sequenceString, else return IllegalArgumentException,  return the size
  def removeElement(element: Any): Int = ???



