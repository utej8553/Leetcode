class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i = 0; i < s.length(); i++){
            s = s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
            if(s.equals(goal)){
                return true;
            }
        }
        return false;
    }
}