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
    public ListNode doubleIt(ListNode head) {
        ListNode help = head;
        ListNode temp = reverse(help);
        ListNode temp1 = temp;
        int carry = 0;
        while(temp1!=null){
            int dou = temp1.val*2 + carry;
            temp1.val = dou%10;
            carry = dou/10;
            if(temp1.next==null&&carry>0){
                temp1.next = new ListNode(carry);
                break;
            }
            temp1 = temp1.next;
        }
        return reverse(temp);

    }
     private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}