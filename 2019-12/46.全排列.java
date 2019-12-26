/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution {
    public void backtrack3(int len, List<List<Integer>> res, List<Integer> numsList, int firstIndex) {
        if (firstIndex == len) {
            res.add(new ArrayList<>(numsList));
        }
        for (int i = firstIndex; i < len; i++) {
            Collections.swap(numsList, i, firstIndex);
            backtrack3(len, res, numsList, firstIndex + 1);
            Collections.swap(numsList, i, firstIndex);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int len = numsList.size();
        backtrack3(len, res, numsList, 0);
        return res;
    }
}
// @lc code=end

