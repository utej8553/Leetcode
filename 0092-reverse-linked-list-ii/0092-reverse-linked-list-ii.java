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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.reverse(list.subList(left-1, right));
        ListNode res = new ListNode(0);
        temp = res;
        for(int i = 0;i< list.size(); i++){
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        return res.next;
    }
}