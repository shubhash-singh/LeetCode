class Solution:
    def maxScore(self, s: str) -> int:
        res = 0
        for i in range(len(s)-1):
            first_division = s[:i+1]
            second_division = s[i+1:]
            print(first_division + "   " +second_division)
            max = first_division.count("0") + second_division.count("1")
            if max > res:
                res = max
            
        return res
    
a = Solution()

s = "011101"
print(a.maxScore(s)) # 5