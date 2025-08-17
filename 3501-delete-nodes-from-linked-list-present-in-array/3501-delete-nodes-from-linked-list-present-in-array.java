/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode res = new ListNode(0);
        Set<Integer> list = new HashSet<>();
        for (int num : nums) {
            list.add(num);
        }
        ListNode temp = res;
        while (head != null) {
            if (!list.contains(head.val)) {
                temp.next = new ListNode(head.val);
                temp = temp.next;
            }
            head = head.next;
        }
        return res.next;
    }
}