class Solution {
    public int longestNiceSubarray(int[] nums) {
        int maxcount = 1;
        for (int i = 0; i < nums.length; i++) { 
            int temp = nums[i];
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if ((temp & nums[j]) == 0) { 
                    temp |= nums[j];
                    count++;
                } else {
                    break;
                }
            }
            maxcount = Math.max(maxcount, count);
        }
        return maxcount;
    }
}
