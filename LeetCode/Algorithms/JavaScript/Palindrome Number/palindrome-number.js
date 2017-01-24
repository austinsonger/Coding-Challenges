// Source : https://leetcode.com/problems/palindrome-number/
// Author : Austin Vern Songer
// Date   : 2015-08-09

/**
 * @param {number} x
 * @return {boolean}
 */
 
var isPalindrome = function(x) {
    return x.toString() == x.toString().split('').reverse().join('');
};