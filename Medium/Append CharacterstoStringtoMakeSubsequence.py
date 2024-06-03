# https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/

class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
        s_len, t_len = len(s), len(t)
        t_ptr = 0
        
        for s_ptr in range(s_len):
            if t_ptr < t_len and s[s_ptr] == t[t_ptr]:
                t_ptr += 1
                
        # Number of characters left in t that are not matched
        return t_len - t_ptr