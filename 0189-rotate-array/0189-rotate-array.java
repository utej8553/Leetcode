import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length; 

        int[] temp1 = Arrays.copyOfRange(nums, 0, nums.length - k);
        int[] temp2 = Arrays.copyOfRange(nums, nums.length - k, nums.length);

        System.arraycopy(temp2, 0, nums, 0, temp2.length);

        System.arraycopy(temp1, 0, nums, temp2.length, temp1.length);
    }
}
