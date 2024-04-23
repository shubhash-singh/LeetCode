# https://leetcode.com/problems/roman-to-integer/ 

class Solution:
    def roman_to_integer(self, s:str) -> int:
        romanValues = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        result = 0
        last_value = 1000
        for i in s:
            value = romanValues[i]
            if value > last_value:
                result += value-last_value
            else:
                result += value
                       
            last_value = value
            print("VAlue: " , value)
            
            print('Result = ', result)
            print('Lat Value: ', last_value,'\n')
        return result
    
s = input().upper()
a = Solution()
print(a.roman_to_integer(s))

# MCMXCIV :: Input
# 1994 :: Output