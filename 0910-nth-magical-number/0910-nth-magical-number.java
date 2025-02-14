class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
        long mod = 1_000_000_007;
        long lcm = (long)a*b/gcd(a,b);
        long left = 1;
        long right = (long)n*Math.min(a,b); 
        while(left<right){
            long mid = left + (right-left)/2;
            long count = mid/a + mid/b - mid/lcm;
            if(count<n){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return (int)(left%mod);
    }
    private int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}