class Solution {
   public double myPow(double x, int n) {
    // Base case: if x is 1, return 1 (any number raised to any power is 1)
    if (x == 1) {
        return 1;
    }

    // Handle negative exponents
    if (n < 0) {
        // If n is Integer.MIN_VALUE, the negation would cause overflow
        if (n == Integer.MIN_VALUE) {
            x = 1 / x;
            n = Integer.MAX_VALUE;
            return myPow(x, n) / x;
        }
        
        x = 1 / x;
        n = -n;
    }

    double res = 1;
    double currentProduct = x;

    while (n > 0) {
        if (n % 2 == 1) {
            res *= currentProduct;
        }
        currentProduct *= currentProduct;
        n /= 2;
    }

    return res;
}


}