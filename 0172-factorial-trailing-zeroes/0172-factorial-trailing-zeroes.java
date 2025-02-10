class Solution {
    public int trailingZeroes(int n) {
        int temp = n;
        int count = 0;
        while(true){
            temp = temp/5;
            count = count + temp;
            if(temp==0){
                break;
            }
        }
        return count;
    }
}