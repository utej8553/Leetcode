class Solution {
    public boolean checkPowersOfThree(int n) {
        return Func(n, 0, 1);
    }

    public boolean Func(int n, int sum, int powerval) {
        if (sum > n) {
            return false;
        }
        if (sum == n) {
            return true;
        }
        if(powerval>n){
            return false;
        }
        if (Func(n, sum + powerval, powerval * 3)) {
            return true;
        }
        return Func(n, sum, powerval * 3);
    }
}
