class Solution {
    public int findGCD(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            l.add(nums[i]);
        }
        return gcd(Collections.max(l), Collections.min(l));
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}