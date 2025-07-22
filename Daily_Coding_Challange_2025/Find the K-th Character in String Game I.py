class Solution:
    def kthCharacter(self, k: int) -> str:
        res = "a"
        current_length = 1
        while current_length < k:
            # The new string appended will be a copy of the current string,
            # but with each character incremented.
            # The length doubles in each iteration.
            current_length *= 2
        
        return chr(ord('a') + (k - 1) % 26)


a = Solution()
print(a.kthCharacter(5))