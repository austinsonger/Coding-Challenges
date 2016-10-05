package com.pktippa
import scala.collection.immutable.List

object RemoveDuplicates {
  def main(args: Array[String]) {
    // Read input from command line
    val input:String = readLine();
    // Converting given input into List of characters
    var list = input.toList;
    // Calling distinct method in list to get unique characters in list
    // Build string from list of characters
    print(list.distinct.mkString);
  }
}