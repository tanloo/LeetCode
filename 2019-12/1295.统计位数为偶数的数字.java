/*
 * @lc app=leetcode.cn id=1295 lang=java
 *
 * [1295] 统计位数为偶数的数字
 */

// @lc code=start
class Solution {
    public int findNumbers(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                i++;
            }
        }
        return i;
    }
}
// @lc code=end

