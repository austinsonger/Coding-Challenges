package com.pktippa

object FilterPositionsInAList {
  def main(args: Array[String]) {
    //var lines = io.Source.stdin.getLines(); // TODO: Giving multiple lines with no limit of no of lines
    //var listLines = lines.toList;
    //var listInt = listLines.map(_.trim).map(_.toInt);
    // Initializing list as if it read from the input
    var listInt=List(1,2,3,4,5,6);
    // Calling filterPostion function to get the Filtered list
    var filteredPostionsList = filterPosition(listInt);
    // Printing filtered list with new line
    filteredPostionsList.foreach(println(_));
  }
  def filterPosition(inputList:List[Int]) : List[Int] = {
    // Getting length of inputList
    var inputListLength = inputList.length;
    // Initializing the List of Integers
    var mapListIndexes:List[Int] = List[Int]();
    // Looping through 0 to inputListLength-1
    for(i <- 0 to inputListLength-1){
      if(i%2 != 0){ // Checking whether the index is odd or not
        mapListIndexes = mapListIndexes :+ i;  // Adding index to the mapListIndexes
      }
    }
    mapListIndexes.map(index=>inputList(index));  // For each index getting the value from the inputList from that index   
  }
}