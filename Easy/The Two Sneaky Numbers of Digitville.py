class Solution:
    def getSneakyNumbers(self, nums: list[int]) -> list[int]:
        res = list(set([_ for _ in nums if nums.count(_) == 2]))
        return res