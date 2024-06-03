# https://leetcode.com/problems/find-target-indices-after-sorting-array/

class Solution:
    def targetIndices(self, nums: list[int], target: int) -> list[int]:
        result = []
        if target not in nums:
            return result
        else:
            nums.sort()
            for i in range(len(nums)):
                if (nums[i] == target):
                    result.append(i)
            
            return result