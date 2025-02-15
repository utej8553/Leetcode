class Solution {
    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (Func(String.valueOf(square), 0, 0, i)) {
                sum += square;
            }
        }
        return sum;
    }
    public boolean Func(String s, int sum, int index, int target){
        if(index==s.length()){
            return sum==target;
        }
        int num = 0;
        for(int i = index; i < s.length(); i++){
            num = num*10 + (s.charAt(i)-'0');
            if(Func(s, sum+num, i+1, target)){
                return true;
            }
        }
        return false;

    }
}