class Solution {
     public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);
        
        while (fast != 1 && slow != fast) {
            slow = getNext(slow);          
            fast = getNext(getNext(fast));  
        }
        
        return fast == 1;
    }

    public int getNext(int num) {
        int res = 0;
        while (num > 0) {
            int rem = num % 10;
            res += rem * rem; 
            num /= 10;        
        }
        return res;
    }
}