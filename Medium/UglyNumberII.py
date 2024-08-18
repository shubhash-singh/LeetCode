# https://leetcode.com/problems/ugly-number-ii/


class Solution:
    def nthUglyNumber(self, n: int) -> int:
        ugly_numbers = [0] * n
        ugly_numbers[0] = 1
        
        i2 = i3 = i5 = 0
        
        next_ugly_2 = 2
        next_ugly_3 = 3
        next_ugly_5 = 5
        
        for i in range(1, n):
            next_ugly = min(next_ugly_2, next_ugly_3, next_ugly_5)
            ugly_numbers[i] = next_ugly
            
            if next_ugly == next_ugly_2:
                i2 += 1
                next_ugly_2 = ugly_numbers[i2] * 2
            
            if next_ugly == next_ugly_3:
                i3 += 1
                next_ugly_3 = ugly_numbers[i3] * 3
            
            if next_ugly == next_ugly_5:
                i5 += 1
                next_ugly_5 = ugly_numbers[i5] * 5
        
        return ugly_numbers[-1]