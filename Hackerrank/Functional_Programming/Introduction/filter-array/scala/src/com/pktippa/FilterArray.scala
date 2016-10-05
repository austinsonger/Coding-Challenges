package com.pktippa

object FilterArray {
  def main(args: Array[String]) {
    // Initializing the delimiter
    var delim:Int = 3;
    // Initializing the initial List of the numbers
    var initList:List[Int] = List(10,9,8,2,7,5,1,3,0);
    // Calling filterList function to get the filteredList
    var filteredList = filterList(delim,initList);
    // Looping through list using foreach and executing println on each value( _ represents current value) 
    filteredList.foreach( println(_));
  }
  // filterList function will filter the List of integers which are less than the delimiter value
  def filterList(delim:Int, initList:List[Int]) : List[Int] = {
    // filter maps to the condition as true - Here _ refers to current value and condition is less than delimiter
    return initList.filter( _ < delim ); 
  }
}