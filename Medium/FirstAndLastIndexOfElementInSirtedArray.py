# https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution(object):
    def searchRange(self, nums: list[int], target: int) -> list[int]:
        result = [-1, -1]
        if len(nums) == 0: return result
        elif len(nums) == 1 and nums[0] == target:
            result[0] = 0
            result[1] = 0
            return result
        elif len(nums) == 2 and nums[0] == target and nums[1] == target:
            result[0] = 0
            result[1] = 1
            return result
        else:
            result[0] = nums.index(target)
            result[1] - nums[::-1].index(target)
                        
        return result
    
a = Solution()
print(a.searchRange([2,2], 2))