
# https://leetcode.com/problems/reverse-string/
class Solution:

    def reverseString(self, s: list[str]) -> None:
        s[:] = s[::-1]
        