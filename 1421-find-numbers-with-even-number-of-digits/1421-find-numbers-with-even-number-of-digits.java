class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            String temp = String.valueOf(nums[i]);
            if(temp.length()%2==0){
                res++;
            }
        }
        return res;
    }
}