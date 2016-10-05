package com.pktippa

object HelloWorldNTimes {
  def main(args: Array[String]) {
    // No of times the Hello world need to be printed
    var noOfTimes:Int = 4;
    // Calling printHelloWorldNTimes with noOfTimes "Hello World" need to be printed.
    printHelloWorldNTimes(noOfTimes);
  }
  // Function which takes the no of times and loops through noOfTimes and prints "Hello World" those many times
  def printHelloWorldNTimes(n:Int) = {
    // Using for loop - to loop from 1 to n
    for(i <- 1 to n){
      println("Hello World"); // Printing "Hello World"
    }
  }
}