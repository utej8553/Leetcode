class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long totalPairs = (long) nums.length * (nums.length - 1) / 2; // Use long to prevent overflow
        long goodPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i] - i;
            if (map.containsKey(key)) {
                goodPairs += map.get(key); // Add previous occurrences
            }
            map.put(key, map.getOrDefault(key, 0) + 1); // Update count
        }

        return totalPairs - goodPairs;
    }
}