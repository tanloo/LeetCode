/*
 * @lc app=leetcode.cn id=807 lang=java
 *
 * [807] 保持城市天际线
 */

// @lc code=start
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int result = 0;
        int len = grid[0].length;
        int[] col = new int[len];
        int[] row = new int[len];
        for (int i = 0; i < len; i++) {
            int rowMax = 0;
            int colMax = 0;

            for (int j = 1; j < len; j++) {
                rowMax = Math.max(Math.max(grid[i][j - 1], grid[i][j]), rowMax);
                colMax = Math.max(Math.max(grid[j][i], grid[j - 1][i]), colMax);
            }
            row[i] = rowMax;
            col[i] = colMax;
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                result += Math.min(row[i], col[j]) - grid[i][j];
            }
        }
        return result;
    }
}
// @lc code=end

