import java.util.*;

class Solution {
    Map<Integer, List<Integer>> map;
    Random rand;

    public Solution(int[] nums) {
        map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>()); 
            map.get(nums[i]).add(i);
        }
        rand = new Random();
    }

    public int pick(int target) {
        List<Integer> indices = map.get(target);
        return indices.get(rand.nextInt(indices.size()));
    }
}

/**
 * Usage:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
