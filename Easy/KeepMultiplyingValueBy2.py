# https://leetcode.com/problems/keep-multiplying-found-values-by-two/

class Solution:
    def findFinalValue(self, nums: list[int], original: int) -> int:
        for i in nums:
            if original in nums:
                original *= 2
            else:
                break
        return original