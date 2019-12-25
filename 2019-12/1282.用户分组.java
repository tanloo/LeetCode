/*
 * @lc app=leetcode.cn id=1282 lang=java
 *
 * [1282] 用户分组
 */

// @lc code=start
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            map.computeIfAbsent(groupSizes[i], x -> new ArrayList<>());
            List<Integer> group = map.get(groupSizes[i]);
            group.add(i);
            if (group.size() == groupSizes[i]) {
                result.add(new ArrayList<>(group));
                group.clear();
            }
        }
        return result;
    }
}
// @lc code=end

