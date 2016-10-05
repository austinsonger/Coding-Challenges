package com.pktippa

object RotateString {
  def main(args: Array[String]) {
    // Reading number of Test cases
    var noOfTestCases:Int = readInt();
    // Initializing the Array of Strings with length of noOfTestCases
    var arrayOfStrings= new Array[String](noOfTestCases);
    // Looping through 0 to noOfTestCases-1 
    for(x <- 0 to noOfTestCases-1){
      // Reading the line from the command line
      var currentLine = readLine();
      // Trimming the spaces and new line chars
      arrayOfStrings(x) = currentLine.trim;
    }
    // Looping through arrayOfStrings from 0 to till arrayOfStrings.length
    for(x <- 0 until arrayOfStrings.length){
      // Accessing current element in the loop
      var currentString = arrayOfStrings(x);
      // Looping through 0 to currentString.length
      for(y <- 0 until currentString.length){
        currentString = generateString(currentString);
        print(currentString+ " ")
      }
      println();
    }
  }
  // Method generateString
  // Accepts currentString : String - Ex: room
  // Returns :String - Ex: oomr
  def generateString(currentString:String):String = {
    // Getting String from pos 1 to pos currentString.length
    // Getting String from pos 0 to pos 1
    // Concatinating both and returning same;
    currentString.substring(1, currentString.length) + currentString.substring(0,1)
  }
}