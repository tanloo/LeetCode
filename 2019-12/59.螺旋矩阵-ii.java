/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int t = 0, r = n - 1, b = n - 1, l = 0;
        int max = n * n, num = 1;
        while (num <= max) {
            for (int i = l; i <= r; i++) {
                result[t][i] = num++;
            }
            t++;
            for (int i = t; i <= b; i++) {
                result[i][r] = num++;
            }
            r--;
            for (int i = r; i >= l; i--) {
                result[b][i] = num++;
            }
            b--;
            for (int i = b; i >= t; i--) {
                result[i][l] = num++;
            }
            l++;
        }
        return result;
    }
}
// @lc code=end

