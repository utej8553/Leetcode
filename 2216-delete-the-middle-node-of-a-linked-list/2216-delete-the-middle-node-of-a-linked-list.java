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
    public ListNode deleteMiddle(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        ListNode res = new ListNode(0);
        ListNode temp = res;
        list.remove(list.size()/2);
        for(int i = 0; i < list.size(); i++){
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        return res.next;
    }
}