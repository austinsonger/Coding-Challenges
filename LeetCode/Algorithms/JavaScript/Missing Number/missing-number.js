// Source : https://leetcode.com/problems/missing-number/
// Author : Austin Vern Songer
// Date   : 2015-08-24

/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
  var hash = [];
  nums.forEach(function(item) {
    hash[item] = true;
  });

  for (var i = 0; ; i++) 
    if (!hash[i]) 
      return i;
};