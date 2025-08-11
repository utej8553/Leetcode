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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < lists.length; i++){
            ListNode temp = lists[i];
            while(temp!=null){
                list.add(temp.val);
                temp = temp.next;
            }
        }
        if(list.size()==0){
            return null;
        }
        Collections.sort(list);
        ListNode res = new ListNode(list.get(0));
        ListNode temp = res;
        for(int i = 1; i < list.size(); i++){
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        return res;
    }
}