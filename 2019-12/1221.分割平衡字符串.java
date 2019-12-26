/*
 * @lc app=leetcode.cn id=1221 lang=java
 *
 * [1221] 分割平衡字符串
 */

// @lc code=start
class Solution {
    public int balancedStringSplit(String s) {
        int result = 0, nums = 0;
        for (char value : s.toCharArray()) {
            if (value == 'L') {
                nums++;
            } else {
                nums--;
            }
            if (nums == 0) {
                result++;
            }
        }
        return result; 
    }
}
// @lc code=end

