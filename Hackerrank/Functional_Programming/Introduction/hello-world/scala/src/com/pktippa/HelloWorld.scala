package com.pktippa

object HelloWorld {
  def main(args: Array[String]) {
    
    printHelloWorld; // Function without any parameters can be called with out Paranthesis - ( )
  }
  def printHelloWorld() = println("Hello World") // Function which has only one line of execution - there is no need to give Braces ("curly braces") - { }
}