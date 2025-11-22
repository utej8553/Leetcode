class Solution {
    public int reverse(int x) {
    int num = x;
    int res = 0;
    
    while (num != 0) {
        int digit = num % 10;
        int newRes = res * 10 + digit;
        
        // Check for overflow before updating res
        if ((newRes - digit) / 10 != res) {
            return 0;
        }
        
        res = newRes;
        num = num / 10;
    }
    
    return res;
}

}