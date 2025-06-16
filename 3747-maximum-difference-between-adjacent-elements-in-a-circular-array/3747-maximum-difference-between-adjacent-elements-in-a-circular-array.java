class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < nums.length; i++){
            if(Math.abs(nums[i-1]-nums[i])>max){
                max = Math.abs(nums[i-1]-nums[i]);
            }
        }
        if(Math.abs(nums[0]-nums[nums.length-1])>max){
            max = Math.abs(nums[0]-nums[nums.length-1]);
        }
        return max;
    }
}