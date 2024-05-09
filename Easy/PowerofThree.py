# https://leetcode.com/problems/power-of-three/

class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        if n < 1:
            return False
        
        power = 1
        while power < n:
            power *= 3
        
        return power == n