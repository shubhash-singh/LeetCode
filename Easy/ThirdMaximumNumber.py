#  https://leetcode.com/problems/third-maximum-number/

class Solution:
    def thirdMax(self, nums: list[int]) -> int:
        nums = list(set(nums))
        nums.sort(reverse=True)
        if len(nums) >= 3:
            return nums[2]
        else:
            return nums[0]