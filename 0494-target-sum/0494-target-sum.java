class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        return Func(nums, 0, target, 0);
    }
    public int Func(int[] nums, int index, int target, int sum){
        if(index>=nums.length){
            if(sum==target){
                return 1;
            }else {
                return 0;
            }
        }
        int n1 = Func(nums, index+1, target, sum+nums[index]);
        int n2 = Func(nums, index+1, target, sum-nums[index]);
        return n1+n2;
    }
}