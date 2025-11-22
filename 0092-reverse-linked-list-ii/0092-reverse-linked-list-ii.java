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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        return reverseBetween(left, head, right);
        
    }
    public static ListNode reverseBetween(int left, ListNode list, int right) {
        if (list == null || left == right) {
            return list;
        }

       ListNode List1 = new ListNode(0);
       List1.next = list;
       ListNode temp = list1;
       for (int i = 0; i < left-1; i++) {
        temp = temp.next;
       }
       ListNode left = new ListNode(0);
        for(int i = left; i < mid; i++) {
            left.next = new ListNode(temp)
        }
    }
}