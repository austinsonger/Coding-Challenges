package com.pktippa

object ListLength {
  def main(args: Array[String]) {
    // Given input list in List[Int]
    var inputList=List(3,2,4,6,5,7,8,0,1);
    // Getting the list length of inputList and printing result
    println(getListLength(inputList));
  }
  // Method getListLength - to get list length of a List[Int]
  // Accepts inputList : List[Int]
  // Returns listLength Int
  def getListLength(inputList:List[Int]):Int = {
    // Initializing listLength Int to 0
    var listLength: Int = 0;
    // For loop 0 until inputList.length
    for(n <- 0 until inputList.length){
      listLength += 1; // Incrementing list length by 1
    }
    // Returning sumOfOddElements
    listLength
  }
}