class Solution:
    def waysToSplitArray(self, nums: list[int]) -> int:
        n=len(nums)
        Sum=sum(nums)
        acc = 0
        cnt = 0
        for i in range(n-1):
            acc += nums[i]
            cnt += (2*acc >= Sum)
        return cnt        