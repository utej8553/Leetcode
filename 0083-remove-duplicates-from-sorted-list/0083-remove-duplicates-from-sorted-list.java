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
    public ListNode deleteDuplicates(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            if(!list.contains(temp.val)){
                list.add(temp.val);
            }
            temp = temp.next;
        }
        ListNode res = new ListNode(0);
        temp = res;
        for(Integer num: list){
            temp.next = new ListNode(num);
            temp = temp.next;
        }
        return res.next;
    }
}