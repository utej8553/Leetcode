import java.util.*;

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        List<Integer> ll = new ArrayList<>();
        Func(head, ll);

        ll.removeIf(numSet::contains);

        System.out.println(ll);

        ListNode temp = new ListNode(0);
        ListNode temp1 = temp;

        for (int val : ll) {
            temp1.next = new ListNode(val);
            temp1 = temp1.next;
        }

        return temp.next;
    }

    public void Func(ListNode head, List<Integer> l) {
        while (head != null) {
            l.add(head.val);
            head = head.next;
        }
    }
}
