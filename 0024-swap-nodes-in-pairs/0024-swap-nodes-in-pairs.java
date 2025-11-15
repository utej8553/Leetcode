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
    public ListNode swapPairs(ListNode head) {
        int size = LinkedSize(head);
        ListNode temp = head;
        for (int i = 0; i < size / 2; i++) {
            int tem = temp.val;
            temp.val = temp.next.val;
            temp.next.val = tem;
            temp = temp.next.next;
        }
        return head; 
    }

    public int LinkedSize(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }


}