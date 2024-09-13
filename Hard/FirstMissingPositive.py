# https://leetcode.com/problems/first-missing-positive/

class Solution:
    def firstMissingPositive(self, a: list[int]) -> int:
        return min({*range(1,len(a)+2)}-{*a})