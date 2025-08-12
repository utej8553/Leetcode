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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp = head;
        int size = Size(head);
        if(n==size){
            return head.next;
        }
        for(int i = 0; i < size-n-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    
    public int Size(ListNode head){
        int count = 0;
        while(head!=null){
            head =  head.next;
            count++;
        }
        return count;
    }
}