class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int a = 0;
        int b = nums.length/2;
        for(int i = 0; i < nums.length; i=i+2){
            res[i] = nums[a];
            res[i+1] = nums[b];
            a++;
            b++;
        }
        return res;
    }
}