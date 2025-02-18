class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return IntStream.range(0, arr.length)
                .reduce((i, j) -> arr[i] > arr[j] ? i : j)
                .orElse(-1);
    }
}