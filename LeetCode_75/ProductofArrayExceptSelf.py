class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        n = len(nums)
        
        res = []
        
        prefix = [1] * n
        suffix = [1] * n
        
        # compute prefix
        prefix[0] = 1
        for i in range(1,n):
            prefix[i] = prefix[i-1] * nums[i-1]
        
        for i in range(n-2, -1, -1):
            suffix[i] = suffix[i+1] * nums[i+1]
        
        for i in range(n):
            res.append(prefix[i] * suffix[i])
        return res