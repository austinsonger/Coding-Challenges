package com.pktippa

object UpdateList {
  def main(args: Array[String]) {
    // Given input list in List[Int]
    var inputList=List(2,-4,3,-1,23,-4,-54);
    // Getting the updated list and printing each element with new line using foreach
    getUpdatedList(inputList).foreach(println(_));
  }
  // Method getUpdatedList - to get updated(absolute values) list of a List[Int]
  // Accepts inputList : List[Int]
  // Returns returnList : List[Int]
  def getUpdatedList(inputList:List[Int]):List[Int] = {
    // Initializing returnList with List[Int]
    var returnList = List[Int]();
    // Looping through inputList using for 0 until inputList.length
    for(n <- 0 until inputList.length){
      returnList = returnList :+ math.abs(inputList(n)) // Using math.abs to get absolute value and adding it to returnList
    }
    
    // Returning updated list
    returnList
  }
}