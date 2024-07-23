# https://leetcode.com/problems/largest-odd-number-in-string/

class Solution:
    def largestOddNumber(self, num: str) -> str:
        for c in range(len(num)-1,-1,-1):
            if num[c] in "13579":
                return num[:c+1]
        return ''