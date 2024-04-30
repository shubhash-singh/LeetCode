# https://leetcode.com/problems/remove-element/description/


class Solution(object):
    def removeElement(self, nums:list, val:int) -> int:
        result = 0
        for i in range(len(nums)):
            elem = nums[i]
            if elem == val:
                nums.remove(elem)
                nums.append(elem)
                result +=1

        return len(nums) - result +1
        
nums = [0,1,2,2,3,0,4,2]
val = 2
a = Solution()
print(a.removeElement(nums,val))