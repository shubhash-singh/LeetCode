# https://leetcode.com/problems/number-complement/

class Solution:
    def findComplement(self, num: int) -> int:
        bin_value = bin(num)[2:]
        ones_complement = ''.join('1' if bit == '0' else '0' for bit in bin_value)
        return int(ones_complement,2)
    
a = Solution()
print(a.findComplement(5))