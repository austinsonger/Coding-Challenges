package com.pktippa

object FibonacciNumbers {
  def main(args: Array[String]) {
    // Reading integer value from command line
    var input = readInt();
    println(getFibonacciNumber(input));
  }
  def getFibonacciNumber(x:Int) : Int = {
    x match {
      case 0 => 0  // Return 0
      case 1 => 0  // Return 0
      case 2 => 1  // Return 1
      case _ => getFibonacciNumber(x -1) + getFibonacciNumber(x - 2) // Return f(n-1) + f(n-2)
    }
  }
}