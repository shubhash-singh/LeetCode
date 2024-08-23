from fractions import Fraction
import re
from math import gcd

class Solution:
    def fractionAddition(self, expression: str) -> str:
        fractions = re.findall('[+-]?\\d+/\\d+', expression)
        result = sum(Fraction(f) for f in fractions)
        
        numerator, denominator = result.numerator, result.denominator
        divisor = gcd(numerator, denominator)
        
        numerator //= divisor
        denominator //= divisor
        
        return f"{numerator}/{denominator}"