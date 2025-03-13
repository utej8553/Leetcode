import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(nums); 
        Func(nums, target, l, 0, 0, new ArrayList<>());
        return l;
    }

    public void Func(int[] nums, int target, List<List<Integer>> l, int sum, int index, List<Integer> temp) {
        if (sum == target) {
            l.add(new ArrayList<>(temp));
            return; 
        }
        if (index >= nums.length || sum > target) {
            return;
        }

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            Func(nums, target, l, sum + nums[i], i, temp); 
            temp.remove(temp.size() - 1);
        }
    }
}
