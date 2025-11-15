class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode temp = head;
        while(temp.next!=null && temp!=null) {
            if(temp.val==temp.next.val) {
                temp.next = temp.next.next;
            } else {
            temp = temp.next;
            }
        }
        return head;
    }
}