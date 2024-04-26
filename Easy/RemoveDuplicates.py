class Solution:
    def removeDuplicates(self, nums:list[int]) -> int:
        i = 0
        for i in range(len(nums)):
            if nums[i] != nums[j]:
                i+=1
                nums[i] = nums[j]
        return i+1
