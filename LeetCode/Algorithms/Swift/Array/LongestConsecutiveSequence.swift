/**
 * Question Link: https://leetcode.com/problems/longest-consecutive-sequence/
 * Primary idea: Iterate the array and check all neighbor numbers with the help of set
 *
 * Time Complexity: O(n), Space Complexity: O(n)
 *
 */

class LongestConsecutiveSequence {
    func longestConsecutive(_ nums: [Int]) -> Int {
        var set = Set(nums)
        var longest = 0
        
        for num in nums {
            if set.contains(num) {
                set.remove(num)
                longest = max(1 + findConsecutive(&set, num, 1) + findConsecutive(&set, num, -1), longest)
            }
        }
        
        return longest
    }
    
    private func findConsecutive(_ set: inout Set<Int>, _ num: Int, _ step: Int) -> Int {
        var len = 0
        var num = num + step
    
        while set.contains(num) {
            set.remove(num)
            len += 1
            num += step
        }
        
        return len
    }
}