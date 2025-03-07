class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] isPrime = new boolean[right + 1];
        int[] res = new int[2];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= right; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int prev = -1, curr = -1;
        res[0] = -1;
        res[1] = -1;
        int min = Integer.MAX_VALUE;
        
        for (int i = left; i <= right; i++) { // Traverse from left to right
            if (isPrime[i]) {
                if (prev == -1) {
                    prev = i; // First prime found
                } else {
                    curr = i;
                    if (curr - prev < min) { // Corrected condition
                        min = curr - prev;
                        res[0] = prev;
                        res[1] = curr;
                    }
                    prev = curr; // Move prev forward
                }
            }
        }
        return res;
    }
}