class Solution {
    public int mostWordsFound(String[] nums) {
        int m = Integer.MIN_VALUE;
        int[] n = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            n[i] = nums[i].trim().split("\\s+").length;
            System.out.println(n[i]);
            m = Math.max(m, n[i]);
        }
        return m;
        
    }
}