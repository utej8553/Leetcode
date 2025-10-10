class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int res = Integer.MIN_VALUE;
        int[] dp = new int[energy.length];
        for(int i = energy.length-1; i >= 0; i--){
            dp[i] = energy[i];
            if(i+k<energy.length){
                dp[i] = dp[i]+dp[i+k];
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}