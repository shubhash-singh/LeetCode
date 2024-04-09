# https://leetcode.com/problems/valid-palindrome/
import re 

class Solution(object):
    def isPalindrome(self, s):
        pattern = r'[A-Za-z]'
        string = ""
        for i in s:
            if re.match(pattern, i):
                string += i
            # print(string)
        if string.lower() == string[::-1].lower():
            return True
        return False

s = input()  
a = Solution()
print(a.isPalindrome(s))
# A man, a plan, a canal: Panama