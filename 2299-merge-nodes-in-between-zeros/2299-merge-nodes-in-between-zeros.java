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
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        List<Integer> list2 = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i)==0){
                list2.add(sum);
                sum = 0;
            }
            sum = sum + list.get(i);
        }
        ListNode res = new ListNode(list2.get(0));
        ListNode temp = res;
        for(int i = 1; i < list2.size(); i++){
            temp.next = new ListNode(list2.get(i));
            temp = temp.next;
        }
        return res.next;
    }
}