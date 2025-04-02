class Solution:
    def maximumTripletValue(self, nums: List[int]) -> int:
        m = float('-inf') 
        for i in range(0, len(nums)):
            for j in range(i+1, len(nums)):
                for k in range(j+1, len(nums)):
                     m = max(m, (nums[i] - nums[j]) * nums[k])
        
        return max(m, 0)