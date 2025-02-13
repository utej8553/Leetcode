import java.util.PriorityQueue;

class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        PriorityQueue<Long> p = new PriorityQueue<>();

        for (int num : nums) {
            p.add((long) num);
        }

        while (p.size() >= 2 && p.peek() < k) {
            long num1 = p.poll();
            long num2 = p.poll();
            p.add(num1 * 2 + num2);
            count++;
        }

        return count;
    }
}
