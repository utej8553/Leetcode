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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        if(k==0||Length(head)==1){
            return head;
        }
        int num = k % Length(head);
        if(num==0){
            return head;
        }
        ListNode temp = head;
        for(int i = 0; i < Length(head)-num-1; i++){
            temp = temp.next;
        }
        ListNode temp2 = temp;
        ListNode temp3 = temp2.next;
        while(temp2.next!=null){
            temp2 = temp2.next;
        }    
        temp2.next = head;
        temp.next = null;
        return temp3;
    }
    public int Length(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
}