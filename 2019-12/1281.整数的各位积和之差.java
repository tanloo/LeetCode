/*
 * @lc app=leetcode.cn id=1281 lang=java
 *
 * [1281] 整数的各位积和之差
 */

// @lc code=start
class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int sub = 1;
        while (n != 0) {
            sum += n % 10;
            sub *= n % 10;
            n = n / 10;
        }
        return sub - sum;
    }
}
// @lc code=end

