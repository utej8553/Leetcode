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
        ListNode temp = head;
        while(head!=null&&head.next!=null){
            int num1 = head.val;
            int num2 = head.next.val;
            head.val = num2;
            head.next.val = num1;
            head = head.next.next;
        }
        return temp;
    }
}