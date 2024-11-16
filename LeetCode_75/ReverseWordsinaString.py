# https://leetcode.com/problems/reverse-words-in-a-string

class Solution:
    def reverseWords(self, s: str) -> str:
        
        arr = []
        for i in s.split():
            arr.append(i.strip())
            
        return ' '.join(arr[::-1])