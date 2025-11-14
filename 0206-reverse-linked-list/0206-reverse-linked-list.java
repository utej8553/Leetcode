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
    public ListNode reverseList(ListNode head) {
        int size = Size(head);
        for (int i = 0; i < size / 2; i++) {
            ListNode temp1 = Node(head, i);
            ListNode temp2 = Node(head, size - i - 1);
            int temp = temp1.val;
            temp1.val = temp2.val;
            temp2.val = temp;
        }
        return head;
    }

    public int Size(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) { 
            size++;
            temp = temp.next;
        }
        return size;
    }

    public ListNode Node(ListNode head, int num) {
        ListNode temp = head;
        for (int i = 0; i < num; i++) {
            temp = temp.next;
        }
        return temp;
    }
}