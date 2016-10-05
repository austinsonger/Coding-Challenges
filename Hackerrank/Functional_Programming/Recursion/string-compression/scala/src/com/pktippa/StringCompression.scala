package com.pktippa

import util.control.Breaks._

object StringCompression {
  def main(args: Array[String]) {
    // Reading inputString from command Line
    var inputString = readLine();
    // calling getCompressedString and printing the same
    println(getCompressedString(inputString));
  }
  // Method getCompressedString - Generates compressed string
  // Accepts inputString : String
  // Returns compressedString :  String
  def getCompressedString(inputString:String) : String = {
    // Initializing limit, count to 1
    var limit = 1;
    var count = 1;
    var compressedString = StringBuilder.newBuilder
    for(m <- 0 until inputString.length){
      // outside breakable for limit to check for 1
      breakable{
        if(limit!=1){
          limit-=1;
          break;
        }
        // Setting default limit and count to 1
        limit = 1;
        count = 1;
        // Inner breakable for charAt n ! = charAt n+1
        breakable {
          // Looping through from m until inputString.length -1
          for(n <- m until inputString.length-1){
            // Two consecutive characters are same, incrementing count, limit
            if(inputString.charAt(n) == inputString.charAt(n+1)){
              count+=1;
              limit+=1;
            }else{
              break; // Breaking inner breakable
            }
          }
        }
        // Short form for ternary operator
        var cmprsr = if (count == 1) "" else count;
        // Building the compressedString
        compressedString.append(inputString.charAt(m).toString + cmprsr);
      }      
    }
    // Returning compressedString
    compressedString.toString
  }
}