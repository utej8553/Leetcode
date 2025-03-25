class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                curr_sum = nums[i]+nums[j]
                if curr_sum == target:
                    return [i, j]
        return [-1, -1]
        