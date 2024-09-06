# https://leetcode.com/problems/sum-of-digits-of-string-after-convert/

class Solution:
    def getLucky(self, s: str, k: int) -> int:
        alphabet = "abcdefghijklmnopqrstuvwxyz"
        num = ""
        for i in range(len(s)):
            num += str(alphabet.index(s[i]) + 1)
        
        for j in range(k):
            num = str(self.sum_of_digits(int(num)))
        
        return int(num)    
    def sum_of_digits(self, n:int) -> int:
        return sum(int(digit) for digit in str(abs(n)))


s = "iiii"
k = 1
a = Solution()
print(a.getLucky(s, k))