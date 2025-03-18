class Solution:
    def longestNiceSubarray(self, nums: List[int]) -> int:
        maxcount = 1
        
        for i in range(len(nums)):
            temp = nums[i]
            count = 1
            
            for j in range(i + 1, len(nums)):
                if (temp & nums[j]) == 0:  
                    temp += nums[j]
                    count += 1
                else:
                    break
            
            maxcount = max(maxcount, count)
        
        return maxcount