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
    public ListNode partition(ListNode head, int x) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            if(temp.val<x){
                list1.add(temp.val);
            } else {
                list2.add(temp.val);
            }
            temp = temp.next;
        }
        ListNode res = new ListNode(0);
        temp = res;
        for(int i = 0; i < list1.size(); i++){
            temp.next = new ListNode(list1.get(i));
            temp = temp.next;
        }
        for(int i = 0; i < list2.size(); i++){
            temp.next = new ListNode(list2.get(i));
            temp = temp.next;
        }
        return res.next;

    }
}