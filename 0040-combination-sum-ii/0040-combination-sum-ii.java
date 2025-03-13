import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(nums);
        Func(nums, target, 0, l, 0, new ArrayList<>());
        return l;
    }

    public void Func(int[] nums, int target, int sum, List<List<Integer>> l, int index, List<Integer> temp) {
        if (sum == target) {
            l.add(new ArrayList<>(temp));
            return;
        }
        if (sum > target || index >= nums.length) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            Func(nums, target, sum + nums[i], l, i + 1, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
