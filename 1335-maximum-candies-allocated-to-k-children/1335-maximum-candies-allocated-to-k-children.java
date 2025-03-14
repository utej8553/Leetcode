class Solution {
    public int maximumCandies(int[] candies, long k) {
        long sum = 0;
        int maxCandy = 0;
        for (int c : candies) {
            sum += c;
            maxCandy = Math.max(maxCandy, c);
        }
        if (sum < k) return 0;
        int low = 1, high = maxCandy, best = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            long totalChildren = 0;
            for (int c : candies) {
                totalChildren += c / mid;
            }
            if (totalChildren >= k) {
                best = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return best;
    }
}
