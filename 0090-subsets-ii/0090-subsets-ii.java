import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(nums);
        Func(nums, 0, l, new ArrayList<>());
        l.add(new ArrayList<>());
        return l;
    }
    public void Func(int[] nums, int index, List<List<Integer>> l, List<Integer> temp) {
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            l.add(new ArrayList<>(temp));
            Func(nums, i + 1, l, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
