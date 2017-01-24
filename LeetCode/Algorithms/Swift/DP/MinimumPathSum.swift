/**
 * Question Link: https://leetcode.com/problems/minimum-path-sum/
 * Primary idea: Classic Two Dimensionel Dynamic Programming
 * Time Complexity: O(mn), Space Complexity: O(mn)
 */

class MinimumPathSum {
    func minPathSum(_ grid: [[Int]]) -> Int {
        guard grid.count != 0 && grid[0].count != 0 else{
            return 0
        }
    
        let m = grid.count, n = grid[0].count
        var dp = Array(repeating: Array(repeating: 0, count: n), count: m)
        
        for i in 0 ..< m {
            for j in 0 ..< n {
                if i == 0 && j == 0{
                    dp[i][j] = grid[i][j]
                } else if i == 0 {
                    dp[i][j] = dp[i][j - 1] + grid[i][j]
                } else if j == 0 {
                    dp[i][j] = dp[i - 1][j] + grid[i][j]
                } else {
                    dp[i][j] = min(dp[i][j - 1], dp[i - 1][j]) + grid[i][j]
                }
            }
        }
        
        return dp[m - 1][n - 1]
    }
}