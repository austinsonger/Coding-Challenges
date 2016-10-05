package com.pktippa

import scala.math.Ordering

object ComputingTheGCD {
  def main(args: Array[String]) {
    // Reading the input from command line and trimming it
    var input = readLine().trim();
    // Splitting the values by space
    var individualValues = input.split(" ");
    // Mapping values of Array[String] to List
    var valuesToList = individualValues.map(x=>x.toInt).toList
    // Sorting the List of Integers in descending order
    var valuesInSortedDesc= valuesToList.sorted(Ordering[Int].reverse);
    // Passing first and last value in the List to GCD
    var gcdVal = gcd(valuesInSortedDesc.head,valuesInSortedDesc.reverse.head);
    println(gcdVal);
  }

  // Using Euclidian Algorithm
  // For GCD(x,y) - x = y*q + r if r == 0 ; y is GCD else calculate GCD(y,r) till(recursion) r == 0
  def gcd(x: Int, y: Int): Int =
  {
    var temp = x%y;
    if(temp == 0) // GCD found
      y
    else
      gcd(y,temp) // Recursing
  }
}
