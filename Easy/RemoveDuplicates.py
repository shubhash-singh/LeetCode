# https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution:
    def removeDuplicates(self, nums:list[int]) -> int:
        i = 0
        j=0
        while(j<len(nums)):
            if nums[i] != nums[j]:
                i+=1
                nums[i] = nums[j]
            j+=1
        return i+1
    