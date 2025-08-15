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
    public void reorderList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < list.size()/2; i++){
            res.add(list.get(i));
            res.add(list.get(list.size()-1-i));
        }
        if(list.size()%2==1){
            res.add(list.get(list.size()/2));
        }
        int i = 0;
        while(head!=null){
            head.val = res.get(i);
            head = head.next;
            i  =i+1;
        }
    }
}