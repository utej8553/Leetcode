class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // Edge cases: empty list or single node, or no rotation needed
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Calculate the size of the list
        int size = getSize(head);

        // Compute the effective number of rotations
        k = k % size;
        if (k == 0) {
            return head; // No rotation needed
        }

        // Find the new tail (size - k - 1) and the new head (size - k)
        ListNode newTail = getNodeAtPosition(head, size - k - 1);
        ListNode newHead = newTail.next;

        // Break the list and reconnect the end to the original head
        newTail.next = null;
        ListNode tail = getLastNode(newHead);
        tail.next = head;

        return newHead;
    }

    // Helper method to calculate the size of the list
    private int getSize(ListNode head) {
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    // Helper method to get the node at a specific position
    private ListNode getNodeAtPosition(ListNode head, int position) {
        ListNode current = head;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }
        return current;
    }

    // Helper method to find the last node in the list
    private ListNode getLastNode(ListNode head) {
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }
}
