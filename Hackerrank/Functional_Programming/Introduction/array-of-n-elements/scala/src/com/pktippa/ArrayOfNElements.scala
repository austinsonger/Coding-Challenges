package com.pktippa

object ArrayOfNElements {
  def main(args: Array[String]) {
    // Reading input integer from command line
    var input = readInt();
    // Calling arrayOfNElements and printing each value with new line
    arrayOfNElements(input).foreach(println(_));
  }
  def arrayOfNElements(num:Int) : List[Int] = {
    // Initializing List using ListBuffer
    var result = new scala.collection.mutable.ListBuffer[Int]();
    for(x <- 1 to num){
      result+= 1; // Adding element to List buffer
    }
	return result.toList; // Converting to List and returning the same
  }
}