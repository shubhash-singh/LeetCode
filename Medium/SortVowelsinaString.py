class Solution:
    def sortVowels(self, s: str) -> str:
        vowels = "aeiouAEIOU"
        res_arr = ['`'] * len(s)
        s_arr = list(s)
        vowel_arr = []
        for i in range(len(s_arr)):
            if s_arr[i] not in vowels:
                res_arr[i] = s_arr[i]
            else:
                vowel_arr.append(s_arr[i])
        vowel_arr.sort()
        index = 0
        for i in range(len(res_arr)):
            if res_arr[i] == '`':
                res_arr[i] = vowel_arr[index]
                index += 1
        
        return ''.join(res_arr)

s = "lEetcOde"  
obj = Solution()
print(obj.sortVowels(s))

# "lEOtcede"