package com.pktippa
import scala.collection.immutable.List
import scala.math.BigInt

object HugeGCD {
  def main(args: Array[String]) {
    // Read input from command line
    val aN:Int = readInt();
    val a = readLine.split(" ").map( x => x.toInt);
    val bN:Int = readInt();
    val b = readLine.split(" ").map( x => x.toInt);
    var aB: BigInt = 1;
    var bB: BigInt = 1;
    for(i<-a){
      aB*=i;
    }
    for(i<-b){
      bB*=i;
    }
    if(aB > bB){
      print(gcd(aB,bB)%1000000007);
    }else{
      print(gcd(bB,aB)%1000000007);
    }
  }
  // Method to get GCD
  def gcd(x:BigInt,y:BigInt):BigInt={
    var temp = x%y;
    if(temp==0){
      y
    }else{
      gcd(y,temp)
    }
  }
}