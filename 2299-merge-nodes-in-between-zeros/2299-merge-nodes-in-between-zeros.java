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
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        ListNode res = new ListNode(0);
        ListNode temp = res;
        while(head!=null){
            if(head.val==0){
                temp.next = new ListNode(sum);
                temp = temp.next;
                sum = 0;
            } else {
                sum = sum + head.val;
            }
            head = head.next;
        }
        return res.next.next;
    }
}