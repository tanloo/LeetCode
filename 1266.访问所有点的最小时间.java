/*
 * @lc app=leetcode.cn id=1266 lang=java
 *
 * [1266] 访问所有点的最小时间
 */

// @lc code=start
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for (int i = 1; i < points.length; i++) {
            int max = 0;
            for (int j = 0; j < points[i].length; j++) {
                max = Math.abs(points[i][j] - points[i - 1][j]) - max > 0 ? Math.abs(points[i][j] - points[i - 1][j]) : max;
            }
            result += max;
        }
        return result;
    }
}
// @lc code=end

