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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    int size = LinkedSize(head);
    if (n > size) {
        return head; // If n is greater than the size of the list, return the list unchanged
    }
    if (n == size) {
        return head.next; // If n is equal to the size, remove the head node
    }
    
    ListNode temp = head;
    for (int i = 1; i < size - n; i++) {
        temp = temp.next; // Move to the (size - n)th node
    }
    temp.next = temp.next.next; // Remove the nth node from the end
    return head;
}

public int LinkedSize(ListNode head) {
    int size = 0;
    ListNode temp = head;
    while (temp != null) {
        size++;
        temp = temp.next;
    }
    return size;
}
}