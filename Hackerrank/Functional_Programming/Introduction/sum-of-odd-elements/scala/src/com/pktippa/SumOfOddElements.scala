package com.pktippa

object SumOfOddElements {
  def main(args: Array[String]) {
    // Given input list in List[Int]
    var inputList=List(3,2,4,6,5,7,8,0,1);
    // Getting the getSumOfOddElements of inputList and printing result
    println(getSumOfOddElements(inputList));
  }
  // Method getSumOfOddElements - to get Sum Of Odd Elements of a List[Int]
  // Accepts inputList : List[Int]
  // Returns sumOfOddElements Int
  def getSumOfOddElements(inputList:List[Int]):Int = {
    // Initializing sumOfOddElements Int to 0
    var sumOfOddElements: Int = 0;
    // For loop 0 until inputList.length
    for(n <- 0 until inputList.length){
      // Appending element to the List
      if(inputList(n)%2 != 0) // Checking whether number is a odd or not
        sumOfOddElements += inputList(n); // Adding the odd number to sumOfOddElements
    }
    // Returning sumOfOddElements
    sumOfOddElements
  }
}