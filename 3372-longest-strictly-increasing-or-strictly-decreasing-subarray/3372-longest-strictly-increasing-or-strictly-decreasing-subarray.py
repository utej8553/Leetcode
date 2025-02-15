class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        n = len(nums)
        inc = 1
        dec = 1
        maxele = 1
        for i in range(1,n):
            if nums[i-1]>nums[i]:
                inc = 1
                dec = dec + 1
                maxele = max(maxele, dec)
            elif nums[i-1]<nums[i]:
                inc = inc + 1
                dec = 1
                maxele = max(maxele, inc)
            else:
                inc = 1
                dec = 1
        return maxele