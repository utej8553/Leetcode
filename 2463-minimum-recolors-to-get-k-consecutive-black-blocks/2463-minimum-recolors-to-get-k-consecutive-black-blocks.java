class Solution {
    public int minimumRecolors(String nums, int k) {
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length()-k+1; i++){
            StringBuilder temp = new StringBuilder(nums.substring(i, i+k));
            int min = 0;
            for(int j = 0; j < temp.length(); j++){
                if(temp.charAt(j)=='W'){
                    temp.setCharAt(j, 'B');
                    min++;
                }
            }
            res = Math.min(min, res);
        }
        return res;
    }
}