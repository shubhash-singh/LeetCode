# https://leetcode.com/problems/reverse-words-in-a-string-iii/

class Solution:
    def reverseWords(self, s: str) -> str:
        listStr = s.split()
        for i in range(len(listStr)):
            listStr[i] = listStr[i][::-1]
        
        return " ".join(listStr)