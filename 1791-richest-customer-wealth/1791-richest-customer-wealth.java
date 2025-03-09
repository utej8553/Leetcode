class Solution {
    public int maximumWealth(int[][] nums) {
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int sum = Sum(nums[i]);
            res = Math.max(res, sum);
        }
        return res;
    }
    public int Sum(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        return sum;
    }
}