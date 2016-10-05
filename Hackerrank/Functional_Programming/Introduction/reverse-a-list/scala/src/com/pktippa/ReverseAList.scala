package com.pktippa

object ReverseAList {
  def main(args: Array[String]) {
    // Given input list in List[Int]
    var inputList=List(19,22,3,28,26,17,18,4,28,0);
    // Getting the reversedList and printing each element using foreach
    reverseList(inputList).foreach(println(_));
  }
  // Method reverseList - to reverse a List[Int]
  // Accepts inputList : List[Int]
  // Returns reversed list - List[Int]
  def reverseList(inputList:List[Int]):List[Int] = {
    // Initializing a list
    var returnList = List[Int]();
    // For loop using decrementation Ex: 5 to 0 by -1
    for(n <- inputList.length-1 to 0 by -1){
      // Appending element to the List
      returnList = returnList :+ inputList(n);
    }
    // Returning returnList
    returnList
  }
}