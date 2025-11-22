class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode res = temp;
        
        ListNode current = head;
        ListNode prev = temp; 
        ListNode maxNode = null;
        while (current != null) {
            if (maxNode == null || current.val >= maxNode.val) {
                maxNode = current;
                prev = current; 
            } else {
                prev.next = current.next; 
            current = current.next; 
        }
        
        return res.next;
    }
}
