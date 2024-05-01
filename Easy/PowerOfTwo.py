# https://leetcode.com/problems/power-of-two/

import math

class Solution(object):
    def isPowerOfTwo(self, n: int) -> bool:
        if n < 1:
            return False
        
        power = 1
        while power < n:
            power *= 2
        
        return power == n