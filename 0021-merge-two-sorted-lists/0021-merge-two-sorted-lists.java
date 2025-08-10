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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null&&list2==null){
            return null;
        }
        ListNode res = new ListNode(0);
        ListNode temp = res;
        List<Integer> l = new ArrayList<>();
        while(list1!=null){
            l.add(list1.val);
            list1 = list1.next;
        }
        while(list2!=null){
            l.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(l);
        for(int i = 0; i < l.size(); i++){
            temp.next = new ListNode(l.get(i));
            temp = temp.next;
        }
        return res.next;

    }
}