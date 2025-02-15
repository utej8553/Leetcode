class Solution:
    def check(self, nums: List[int]) -> bool:
        arrsorted = sorted(nums)
        for i in range(len(nums)):
            if nums == arrsorted:
                return True
            nums=  [nums[-1]]+nums[:-1]
        return False