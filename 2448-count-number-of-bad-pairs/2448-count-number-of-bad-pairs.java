class Solution {
    public long countBadPairs(int[] nums) {
        long good = 0;
        long total = (long)nums.length*(nums.length-1)/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int key = nums[i] - i;
            if(map.containsKey(key)){
                good = good + map.get(key);
            }
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        return (long)total-good;
    }
}