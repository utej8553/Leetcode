import java.util.Arrays;

class Solution {
    public boolean check(int[] nums) {
        List<Integer> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            l.add(nums[i]);
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            l1.add(nums[i]);
        }
        for(int i = 0; i < nums.length; i++) {
            Collections.rotate(l, 1);
            if(l1.equals(l)) {
                return true;
            }
        }
        return false;
    }
}
