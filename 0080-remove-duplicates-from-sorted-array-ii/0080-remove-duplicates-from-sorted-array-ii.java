class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int j = 1;
        for(int i =1; i < nums.length; i++){
            if(nums[i-1]==nums[i]){
                if(count<2){
                    nums[j] = nums[i];
                    j++;
                    count++;
                }
            }else {
                nums[j] = nums[i];
                j++;
                count = 1;
            }
        }
        
        return j;

    }
}