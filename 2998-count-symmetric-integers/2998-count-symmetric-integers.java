class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i = low; i <= high; i++){
            String temp = String.valueOf(i);
            if(temp.length() % 2==0 && Func(temp)){
                count++;
            }
        }
        return count;
    }
    public boolean Func(String s){
            int temp1 = 0;
            int temp2 = 0;
            for(int i = 0; i < s.length()/2; i++){
                temp1 = temp1 + (s.charAt(i)-'0');
            }
            for(int i = s.length()/2; i < s.length(); i++){
                temp2 = temp2 + (s.charAt(i)-'0');
            }
            if(temp1==temp2){
                return true;
            } else {
                return false;
            }
    }
}