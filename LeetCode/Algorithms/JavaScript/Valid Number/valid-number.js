// Source : https://leetcode.com/problems/valid-number/
// Author : Austin Vern Songer
// Date   : 2016-04-30

/**
 * @param {string} s
 * @return {boolean}
 */
var isNumber = function(s) {
  if (s.trim() === "")
    return false;
  return !isNaN(Number(s));
};