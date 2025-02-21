class Solution {
    public int mostWordsFound(String[] nums) {
        return Arrays.stream(nums).mapToInt(s -> s.trim().split("\\s+").length).max().orElse(0);

        
    }
}