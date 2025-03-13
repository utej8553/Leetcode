class Solution {
    public long maxStrength(int[] nums) {
        Arrays.sort(nums);
        return Func(nums, 0, 1, false);
    }
    public long Func(int[] nums, int index, long prod, boolean bool){
        if(index>=nums.length){
            return bool?prod:Long.MIN_VALUE;
        }
        
            long res1 = Func(nums, index+1, prod*nums[index], true);
            long res2 = Func(nums, index+1, prod, bool);
            return Math.max(res1, res2);
    }

}
