/* You will get a DNA strand sequence and you need to get the pair and return it as a 2D array of the base pairs. Keep in mind that the provided strand should be first alway

Hint: 1

There are two base case, A-T and C-G, these go both way. You can use regular expression, if statements of anything that you can think of.
try to solve the problem now


Hint: 2

I would recommend using a switch, as it makes things a lot smoother.
try to solve the problem now


Hint: 3

The result must be an array of arrays, so keep that in mind when pushing things.



*/
function pair(str) {
  var pairs = {
    'A': 'T',
    'T': 'A',
    'C': 'G',
    'G': 'C'
  }
  
  var result = [];
  
  for (var i = 0; i <= str.length - 1; i++) {
    var currGene = str.charAt(i);
    result.push([currGene, pairs[currGene]]);
  }
  
  return result;
}

pair("GCG");


/*
Code Explanation:

First define an object with all pair possibilities, this allows us to easily find by key or value.
Split str into a characters array so we can use each letter to find its pair.
Use a loop to go throw the array of characters and replace each character by an array of the pair, thus creating 2d arrays

*/