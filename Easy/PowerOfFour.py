import math

# https://leetcode.com/problems/power-of-four/

class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        if n < 1:
            return False  # Negative numbers or zero are not powers
    
        # Calculate logarithm of target with respect to base
        log_result = math.log(n, 4)
        
        # Check if the log result is very close to an integer
        tolerance = 1e-10  # A small tolerance to account for floating-point errors
        return abs(round(log_result) - log_result) < tolerance