class Solution {
    public String longestPrefix(String s) {
        int[] res = new int[s.length()];
        int j = 0;
        for(int i = 1; i < res.length; i++){
            while(j>0&&s.charAt(i)!=s.charAt(j)){
                j = res[j-1];
            }
            if(s.charAt(j)==s.charAt(i)){
                j++;
                res[i] = j;
            }
        }
        return s.substring(0, res[s.length() - 1]);
    }
}