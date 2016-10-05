package com.pktippa

object SuperDigit {
  // Main Method
  def main(args: Array[String]) {
    // Reading input from command line
    // Splitting on space
    // using match and executing case params by default
    // printing returned value
    println(readLine.split(' ') match {
      case params => superDigit(params(0), params(1).toLong)
    });
  }
  // Recursive function
  // Method superDigit
  // Accepts value: String, times: Long
  // Returns superDigit Long
  def superDigit(value: String, times: Long): Long = {
    value match {
      // Match case if value length is 1 and return the same converting to Int
      case value if value.length == 1 => value.toInt 
      // else case call recursively
      // String foldLeft splits value 1 at a time from left to right
      // passed value to foldLeft will be initialized to first var - in the below case it is sum
      case _ => superDigit((times * value.foldLeft(0)((sum, value) => sum + value.asDigit)).toString, 1)
    }
  }
}