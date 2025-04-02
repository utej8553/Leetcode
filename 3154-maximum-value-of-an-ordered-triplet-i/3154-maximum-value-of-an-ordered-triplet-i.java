class Solution {
    public long maximumTripletValue(int[] nums) {
        long m = Long.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    m = Math.max(m, (long)(nums[i] - nums[j]) * nums[k]);
                }
            }
        }
        return Math.max(m, 0);
    }
}