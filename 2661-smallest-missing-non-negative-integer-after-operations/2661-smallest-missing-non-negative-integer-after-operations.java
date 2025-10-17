class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(Math.floorMod(nums[i], value), map.getOrDefault(Math.floorMod(nums[i], value),0)+1);
        }
        int i = 0;
        while(true){
            int rem = i % value; int div = i / value; 
            if (map.getOrDefault(rem, 0) <= div) { 
                return i; 
            } 
            i++;
        }
    }
}