# https://leetcode.com/problems/maximum-odd-binary-number/

class Solution:
    def maximumOddBinaryNumber(self, s: str) -> str:
        result = sorted(s)[::-1]
        index = len(result) - result[::-1].index('1') - 1
        result[index] = "0"
        result[-1] = '1'
        return ''.join(result)
