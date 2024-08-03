# https://leetcode.com/problems/type-of-triangle/

class Solution:
    def triangleType(self, nums: list[int]) -> str:
        
        if nums[0] + nums[1] > nums[2] and nums[0] + nums[2] > nums[1] and nums[1] + nums[2] > nums[0]:
            if nums[0]==nums[1] and nums[1] == nums[2]:
                return "equilateral"
            elif nums[0] != nums[1] and nums[0] != nums[2] and nums[1] != nums[2]:
                return "scalene"
            else:
                return "isosceles"
        else:
            return "none"