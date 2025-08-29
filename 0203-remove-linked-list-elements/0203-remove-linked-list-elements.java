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
    public ListNode removeElements(ListNode head, int val) {
        List<Integer> set = new ArrayList<>();
        while(head!=null){
            if(head.val!=val){
                set.add(head.val);
            }
            head = head.next;
        }
        ListNode res = new ListNode(0);
        ListNode temp = res;
        for(int i = 0; i < set.size(); i++){
            temp.next = new ListNode(set.get(i));
            temp = temp.next;
        }
        return res.next;
    }
}