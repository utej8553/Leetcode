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
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        Collections.reverse(list);
        ListNode res = new ListNode(0);
        ListNode temp = res;
        for(int i = 0; i < list.size(); i++){
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        return res.next;
    }
}