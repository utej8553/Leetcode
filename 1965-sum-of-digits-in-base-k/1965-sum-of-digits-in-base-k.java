class Solution {
    public int sumBase(int n, int k) {
        String result = Integer.toString(n, k);
        int res = 0;
        for(int i = 0; i < result.length(); i++){
            res = res + (result.charAt(i)-'0');
        }
        return res;
    }
}