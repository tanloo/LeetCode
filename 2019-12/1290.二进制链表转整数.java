/*
 * @lc app=leetcode.cn id=1290 lang=java
 *
 * [1290] 二进制链表转整数
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(String.valueOf(head.val));
            head = head.next;
            if (head == null) {
                return Integer.parseInt(sb.toString(),2);
            }
        }
    }
}
// @lc code=end

