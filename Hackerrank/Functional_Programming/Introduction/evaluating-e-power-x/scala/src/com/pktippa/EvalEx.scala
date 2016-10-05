package com.pktippa

object EvalEx {
	def main(args: Array[String]) {
	 // The series expansion of e^x is given by:

     // 1+x+x^2/2!+x^3/3!+... for first 10 terms
	  
	  // Reading input from command line as integer
	  var noOftestCases = readInt();
	  // Creating Array of float variables 
	  var inputArray:Array[Float] = new Array[Float](noOftestCases);
	  // Using for loop - to loop through from 0 to noOftestCases-1 with auto assigning value to var a
	  for(a <- 0 to noOftestCases-1){
	    // Reading input from command line as Float value and assigning/inserting in the inputArray
	    inputArray(a) = readFloat();
	  }
	  // Using for loop - to loop through array of elements with auto assigning value to var input
	  for(input <- inputArray){
	    // Passing input to calculateEpowerX to calculate E power of x - e^x
	    println(calculateEpowerX(input));
	  }
	}
	def calculateEpowerX(x:Float):Float ={
	  // Since first two terms are 1 + x - Assigning calculatedResult initial value to the same.
	  var calculatedResult: Float = 1 + x;
	  for(a<- 2 to 9){
	    // Calculating numerator x^a using Math.pow - converting explicitly to double since Math.pow(Double, Double)
	    var numerator = Math.pow(x.toDouble, a.toDouble);
	    // Calculating denominator
	    var denominator = (factorial(a)).toDouble;
	    // Adding result to calculatedResult
	    calculatedResult+=(numerator/denominator).toFloat;
	  }
	  // Returning calculated result
	  return calculatedResult;
	}
	def factorial(n: BigInt): BigInt = {  
      if (n <= 1)
         1  
      else    
      n * factorial(n - 1)
   }
}