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
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        while(head!=null){
            if(!set.contains(head.val)&&!duplicates.contains(head.val)){
                set.add(head.val);
            } else if(set.contains(head.val)){
                set.remove(head.val);
                duplicates.add(head.val);
            }
            head = head.next;
        }
        List<Integer> list = new ArrayList<>(set); 
        Collections.sort(list);
        ListNode res = new ListNode(0);
        ListNode temp = res;
        for(int num: list){
            temp.next = new ListNode(num);
            temp = temp.next;
        }
        return res.next;
    }
}