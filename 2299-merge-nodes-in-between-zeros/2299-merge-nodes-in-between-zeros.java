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
        while(head!=null){
            if(head.val==0){
                list.add(sum);
                sum = 0;
            } else {
                sum = sum + head.val;
            }
            head = head.next;
        }
        ListNode res = new ListNode(list.get(0));
        ListNode temp = res;
        for(int i = 1; i < list.size(); i++){
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        return res.next;
    }
}