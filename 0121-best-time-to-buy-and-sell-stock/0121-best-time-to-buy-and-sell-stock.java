class Solution {
    public int maxProfit(int[] nums) {
        int m = Integer.MAX_VALUE;
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            m = Math.min(m, nums[i]);
            res = Math.max(res, nums[i]-m);
        }
        return res;
    }
}