package com.pktippa

object StringMingling {
  def main(args: Array[String]) {   
    // Read Pawel String from command line
    var pawelString =  readLine();
    // Read Shaka String from command line
    var shakaString = readLine();
    // Mingled String
    var mingledString = getMingledString(pawelString,shakaString); 
    println(mingledString);
  }
  // TODO - Need to implement in Recursion
  // Method getMingledString
  // Accepts String, String
  // Returns String
  def getMingledString(first:String,second:String):String = {
    // Initializing mingledString new StringBuilder
    var mingledString = StringBuilder.newBuilder; 
    // Looping through 0 until length of String
    for(x <- 0 until first.length()){
      mingledString.append(first.charAt(x).toString + second.charAt(x).toString) // Building the mingedString
    }
    // Returning Mingled String
    mingledString.toString
  }
}