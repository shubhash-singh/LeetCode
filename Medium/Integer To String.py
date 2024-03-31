# https://leetcode.com/problems/string-to-integer-atoi/
# Problem Link
import re
class Solution(object):
    def result(self, s):
        s = s.strip()
        if not s:
            return 0
        
        sign = 1
        if s[0] in ['+', '-']:
            sign = -1 if s[0] == '-' else 1
            s = s[1:]
        
        result = 0
        for char in s:
            if char.isdigit():
                result = result * 10 + int(char)
            else:
                break
        
        result *= sign
        
        # Ensure result is within the range of 32-bit signed integer
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31
        if result > INT_MAX:
            return INT_MAX
        elif result < INT_MIN:
            return INT_MIN
        else:
            return result

                
                
String = input()
obj = Solution()
print(obj.result(String))