package com.pktippa

object StringReductions {
  def main(args: Array[String]) {
    // Reading input from command line
    var input:String = readLine();
    // Converting to List and getting distinct/unique characters
    var distinctCharList = input.toList.distinct;
    // Building the String from List[char]
    // TODO more reading about collection.breakOut
    val res: String = (for(i <- distinctCharList) yield(i))(collection.breakOut);
    // Printing result
    println(res);
  }
}