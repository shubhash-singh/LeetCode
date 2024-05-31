
# https://leetcode.com/problems/single-number-iii/

class Solution:
    def singleNumber(self, nums: list[int]) -> list[int]:
        result = []
        for i in nums:
            if nums.count(i) == 1:
                result.append(i)

        return result