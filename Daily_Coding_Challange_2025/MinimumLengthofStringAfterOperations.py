from collections import Counter

class Solution:
    def minimumLength(self, s: str) -> int:
        s_arr = sum(1 if x%2 else 2 for x in Counter(s).values())
        return s_arr

a = Solution()
print(a.minimumLength("abaacbcbb"))