class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int m1 = 0;
        int m2 = 0;
        int max_result = 0;
        int min_result = 0;
        for(int i = 0; i < nums.length; i++){
            m1 = Math.max(m1 + nums[i], nums[i]);
            m2 = Math.min(m2 + nums[i], nums[i]);
            max_result = Math.max(m1, max_result);
            min_result = Math.min(m2, min_result);
        }
        return Math.max(max_result, Math.abs(min_result));

    }
}