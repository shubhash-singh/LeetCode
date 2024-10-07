# https://leetcode.com/problems/reverse-prefix-of-word/

class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        if ch in word:
            index = word.index(ch)
            result1 = word[:index+1]
            result2 = word[index+1:]
            
            return result1[::-1] + result2
        else:
            return word
    
obj = Solution()
word = "abcdefd"
ch = "d"
print(obj.reversePrefix(word, ch))

# dcbaefd