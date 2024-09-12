# https://leetcode.com/problems/count-the-number-of-consistent-strings/

class Solution:
    def countConsistentStrings(self, allowed: str, words: list[str]) -> int:
        allowed_set = set(allowed)

        count = 0
        for word in words:
            isAllowed = True
            for char in word:
                if char not in allowed_set:
                    isAllowed = False
            if isAllowed:
                count += 1
        return count