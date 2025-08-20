/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = node;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        list.remove(0);
        for(int i = 0; i < list.size(); i++){
            node.val = list.get(i);
            temp = node;
            node = node.next;
        }
        temp.next = null;
    }
}