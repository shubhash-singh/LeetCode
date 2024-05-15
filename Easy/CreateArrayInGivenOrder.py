# https://leetcode.com/problems/create-target-array-in-the-given-order/

class Solution:
    def createTargetArray(self, nums: list[int], index: list[int]) -> list[int]:
        result = []
        j = 0
        for i in index:
            result.insert(i, nums[j])
            j+=1
        return result