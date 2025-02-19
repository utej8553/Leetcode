class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> l1 = new HashSet<>();
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(l1.contains(nums[i])){
                l.add(nums[i]);
            }
            l1.add(nums[i]);
        }
        return l;
    }
}