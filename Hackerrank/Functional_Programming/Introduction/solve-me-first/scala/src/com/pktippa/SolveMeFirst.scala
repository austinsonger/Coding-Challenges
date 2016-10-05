package com.pktippa

object SolveMeFirst {
  def main(args: Array[String]) {
    // Reading all the lines from command line input
    var lines = io.Source.stdin.getLines();
    // Taking only two lines from it - Iterator[String]
    var parameters = lines.take(2);
    // Converting taken parameters into Integer values - Iterator[Int]
    var integerParams = parameters.map(_.toInt);
    // Calculating sum on Iterator[Int]
    var sum = integerParams.sum;
    println(sum);
  }
}