# https://leetcode.com/problems/longest-palindrome/

from typing import Counter


class Solution:
    def longestPalindrome(self, s: str) -> int:
        cnt = Counter(s)
        ans = sum(v // 2*2 for v in cnt.values())
        ans += int(ans < len(s))
        return ans
