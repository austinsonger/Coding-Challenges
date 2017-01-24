// Source : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
// Author : Austin Vern Songer
// Date   : 2015-08-11

/**
 * @param {number[]} nums
 * @return {number}
 */

var findMin = function(nums) {
  return Math.min.apply(null, nums);
};