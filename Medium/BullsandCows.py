class Solution:
    def getHint(self, secret: str, guess: str) -> str:
        arr_secret = list(secret)
        arr_guess = list(guess)
        cows = 0
        bulls = 0
        for i in range(len(guess)):
            if secret[i] == guess[i]:
                bulls += 1
                arr_secret[i] = 'A'
                arr_guess[i] = 'A'
        for i in range(len(arr_secret)):
            if arr_secret[i] in arr_guess and arr_secret[i] != 'A':
                
                cows += 1
                arr_guess[arr_guess.index(arr_secret[i])] = 'A'
        return f'{bulls}A{cows}B'
        
                
obj = Solution()
print(obj.getHint("1123","0111"))  # Output: "1A3B