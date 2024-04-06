# https://leetcode.com/problems/squares-of-a-sorted-array/

class Solution(object):
    def sortedSquares(self, nums):
        i=0
        while(i<len(nums)):
            nums[i] = nums[i] ** 2
            i+=1
        nums.sort()
        return nums
        