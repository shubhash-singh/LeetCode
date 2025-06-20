class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        words = text.split()
        characters = list(brokenLetters)
        print(characters)
        print(words)
        count  = 0
        for word in words:
            if any(char in word for char in characters):
                count += 1
        return count

a = Solution()
text = "hello world"
brokenLetters = "ad"
print(a.canBeTypedWords(text, brokenLetters))