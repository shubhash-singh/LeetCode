# https://leetcode.com/problems/roman-to-integer/

class Solution:
    def roman_to_integer(self, s:str) -> int:
        romanValues = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        result = 0
        result += romanValues[s[0]]
        # return result
        n = len(s)-1
        while (i<n):
            if romanValues[s[i]] < romanValues[s[i+1]]:
                value = romanValues[s[i]] - romanValues[s[i-1]]
                result += value
                i +=1
            else:
                result += romanValues[s[i]]
            print(result)
        return result
    
s = input().upper()
a = Solution()
print(a.roman_to_integer(s))

# MCMXCIV :: Input
# 1994 :: Output