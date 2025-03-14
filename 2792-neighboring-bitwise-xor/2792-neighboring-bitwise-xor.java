class Solution {
    public boolean doesValidArrayExist(int[] nums) {
        if(nums.length==0){
            return false;
        }
        int temp = nums[0];
        for(int i = 1; i < nums.length; i++){
            temp = temp ^ nums[i];
        }
        return temp==0;
    }
}