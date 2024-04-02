# https://leetcode.com/problems/roman-to-integer/

class Solution:
    def roman_to_integer(self, s:str) -> int:
        romanValues = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        result = 0
        result += romanValues[s[0]]
        # return result
        for i in range(1,len(s)-1):
            if romanValues[s[i]] < romanValues[s[i]]:
                result -= romanValues[s[i-1]]
                result += romanValues[s[i]]
            else:
                result += romanValues[s[i]]
            print(result)
        return result
    
s = input().upper()
a = Solution()
print(a.roman_to_integer(s))

# MCMXCIV :: Input
# 1994 :: Output