package com.pktippa

object PascalsTriangle {
  def main(args: Array[String]) {
    // Reading no of rows for Pascals triangle as integer
    var noOfRows = readInt();
    var currentRowList = List(1);
    // Printing first row
    printCurrentRow(currentRowList);
    // Looping from 1 to noOfRows to generate 
    for(n <- 1 until noOfRows){
      // Generating nth row list and assigning to same current row list
      currentRowList = getNthRow(currentRowList);
      // Printing current row list
      printCurrentRow(currentRowList);
    }    
  }
  // Printing List of Integers with space separated and new line at the end
  def printCurrentRow(currentRow:List[Int]) = {
    for(n <- 0 until currentRow.length){
      print(currentRow(n) + " ");
    }
    println();
  }
  // Method generates Pascal triangle row based on previous row
  // Accepts prvColumn 
  def getNthRow(prvRow:List[Int]):List[Int] = {
    // Initializing return column with List[Int] with 1 added
    var returnRow = List(1);
    // Looping through 1 until prvRow.length
    for(n <- 1 until prvRow.length){
      // elementrow[col] = prvrow n-1   +   prvRow n
      returnRow = returnRow :+ (prvRow(n-1) + prvRow(n))
    }
    // Adding 1 to returnColumn at the end
    returnRow = returnRow :+1;
    // Returning the New Column List
    returnRow
  }
  
}