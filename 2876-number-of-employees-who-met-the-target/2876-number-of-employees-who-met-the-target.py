class Solution:
    def numberOfEmployeesWhoMetTarget(self, hours: List[int], target: int) -> int:
        n = 0
        for i in range(len(hours)):
            if hours[i] >= target:
                n = n + 1

        return n