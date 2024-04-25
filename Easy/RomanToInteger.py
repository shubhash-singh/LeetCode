# https://leetcode.com/problems/roman-to-integer/

class Solution:
    def roman_to_integer(self, s: str) -> int:
        romanValues = {'I': 1, 'V': 5, 'X': 10,
                       'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        result = 0
        i = 0
        while (i < len(s)-1):
            current_value = romanValues[s[i]]
            next_value = romanValues[s[i+1]]
            if current_value < next_value:
                result += next_value - current_value
                i += 2
            else:
                result += current_value
                i += 1
            
        if (i == len(s)-1):
            result += romanValues[s[i]]
        return result
            


s = input().upper()
a = Solution()
print(a.roman_to_integer(s))

# MCMXCIV :: Input
# 1994 :: Output
