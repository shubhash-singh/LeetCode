import re
# https://leetcode.com/problems/regular-expression-matching/

class Solution:
    def isMatch(self, s: str, p: str) -> bool:
        try:
            return(str(bool(re.search(p, s))).lower())
        except Exception as e:
            return False
        
result = Solution()
print(result.isMatch(input(), input()))