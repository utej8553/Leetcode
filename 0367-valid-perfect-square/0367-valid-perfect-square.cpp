class Solution {
public:
    bool isPerfectSquare(int num) {
        if(num==1||num==0){
            return true;
        }
        int i = 2;
        long prod;
        while((prod = (long)i * i) <= num){
            if(prod==num){
                return true;
            }
            i++;
        }
        return false;
    }
};