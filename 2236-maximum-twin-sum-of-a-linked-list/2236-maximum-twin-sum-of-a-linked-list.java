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
    public int pairSum(ListNode head) {
        ListNode temp = head;
        int size = Size(temp);
        int[] num = new int[size/2];
        for(int i = 0; temp!=null; i++) {
            if (i < size / 2) {
                num[i] = temp.val;
            } else {
                num[size - 1 - i] += temp.val;
            }
            temp = temp.next;
        }
        int largest = Arrays.stream(num).max().getAsInt();
        return largest;
    }
     public int Size(ListNode temp) {
        int res = 0;
        while (temp != null) { 
            res++;
            temp = temp.next;
        }
        return res;
    }
}