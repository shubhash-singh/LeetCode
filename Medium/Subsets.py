# https://leetcode.com/problems/subsets/

class Solution:
    def subsets(self, nums: list[int]) -> list[list[int]]:
        result = [[]]  # Start with the empty subset
        for num in nums:
            # Add the current number to all existing subsets
            result += [curr + [num] for curr in result]
        return result