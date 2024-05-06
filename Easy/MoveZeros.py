# https://leetcode.com/problems/move-zeroes/
# Not Solved

class Solution():
    def moveZeros(self, nums:list[int]) -> list[int]:
        for i in range(len(nums)):
            if nums[i] == 0:
                elem = nums.pop(i)
                nums.append(elem)
                # print(elem)
                print(nums)
        return nums

a = Solution()

result = a.moveZeros([0,0,1])
print(result)