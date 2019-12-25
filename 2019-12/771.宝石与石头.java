/*
 * @lc app=leetcode.cn id=771 lang=java
 *
 * [771] 宝石与石头
 */

// @lc code=start
class Solution {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        for (char c : S.toCharArray()) {
            result += J.indexOf(c) >= 0 ? 1 : 0;
        }
        return result;
    }
}
// @lc code=end

