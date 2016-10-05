package com.pktippa

object StringOPermute {
  def main(args: Array[String]) {
    // Reading noOfTestCases from command line input
    var noOfTestCases = readInt();
    // Initializing array of Strings with length of noOfTestCases
    var inputStrings = new Array[String](noOfTestCases);
    // Looping through 0 until noOfTestCases for reading input from command line
    for(n <- 0 until noOfTestCases){
      inputStrings(n) = readLine(); // Get input from command line
    }
    // Looping through all inputStrings to get permuted string
    for(n <- 0 until inputStrings.length){
      println(getPermuteString(inputStrings(n))); // Calling getPermuteString to get permuted String and printing
    }
  }
  // Method getPermuteString - generates permuted String
  // Accepts inputString : String
  // Returns permutedString :  String
  def getPermuteString(inputString:String) : String = {
    // Initializing new StringBuilder
    var permutedString = StringBuilder.newBuilder
    // Looping through chars from inputString 
    for(n <- 0 until inputString.length by 2){ // For loop increment by 2
      // Appending the result by Getting chars at n+1, n
      permutedString.append(inputString.charAt(n+1).toString + inputString.charAt(n).toString);
    }
    // Returning permuted String
    permutedString.toString
  }
}