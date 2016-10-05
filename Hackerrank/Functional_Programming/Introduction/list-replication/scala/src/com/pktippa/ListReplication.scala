package com.pktippa

import java.util.ArrayList

object ListReplication {
  def main(args: Array[String]) {
    var replicationCount = 3; // Read integer input from command line
    var replicationList = List(1,3,5); // Read input from command line as list
    println(replicateList(replicationCount, replicationList))
  }
  def replicateList(n:Int, list:List[Int]): List[Int] = {
    var returnedList = Array[Int](); // Initializing Empty Array of Integers
    for(item <- list){  // Looping through each element in the list
      for(x <- 1 to n){ // Normal for loop - to loop through 1 to n
        returnedList = returnedList :+ item   // Adding element (append) to the Array 
      }
    }
    returnedList.toList  // Converting Array to List
  }
}