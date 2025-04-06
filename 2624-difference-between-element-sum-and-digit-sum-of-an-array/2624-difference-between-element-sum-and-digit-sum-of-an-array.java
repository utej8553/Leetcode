class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int dsum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            dsum = dsum + digit(nums[i]);
        }
        return Math.abs(sum-dsum);
    }
    public static int digit(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}