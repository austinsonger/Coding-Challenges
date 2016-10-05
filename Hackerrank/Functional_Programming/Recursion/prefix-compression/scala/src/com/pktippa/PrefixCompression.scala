package com.pktippa

object PrefixCompression {
  // Initializing class level variables
  var x = "";
  var y = "";
  var minLength = 0;
  // Creating prefix compression string using string builder
  var p = StringBuilder.newBuilder;
  def main(args: Array[String]) {
    // Reading first string
    x = readLine();
    // Reading second string
    y = readLine();
    // short form for ternary operator - getting minLength
    minLength = if(x.length >= y.length) y.length else x.length
    // Calling recursive to get prefix compressed string
    getCompressedString(0)
    // Printing length and compressed string
    println(p.length + " " + p);
    // Building x' 
    var x1 = x.substring(p.length);
    // Printing x' lenght and string
    println(x1.length + " " + x1);
    // Building y'
    var y1 = y.substring(p.length);
    // Printing y' lenght and string
    println(y1.length + " " + y1);    
  }
  // Method getCompressedString
  // Accepts pos : Int
  // Returns prefix compressed string : String
  def getCompressedString(pos:Int):String = {
    // Checking equality of char at x pos to y pos
    if(pos < minLength && x.charAt(pos) == y.charAt(pos))
       p.insert(0,getCompressedString(pos+1)) // Calling recursively to build prefix compressed string
   // Short form for ternary operator   
   if(pos == 0) x.charAt(pos).toString
   else x.charAt(pos-1).toString
  }
}