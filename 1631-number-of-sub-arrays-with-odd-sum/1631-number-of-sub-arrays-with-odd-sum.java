class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1000000007;
        int even = 1;
        int odd = 0;
        int pre = 0;
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            pre = pre + arr[i];
            if(pre%2==0){
                res = res + odd;
                even++;
            } else{
                res = res + even;
                odd++;
            }
            res = res % mod;
        }
        return res;
    }
}