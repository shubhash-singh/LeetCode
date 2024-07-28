# https://leetcode.com/problems/keyboard-row/

class Solution:
    def findWords(self, words: list[str]) -> list[str]:
        row1 = set("qwertyuiopQWERTYUIOP")
        row2 = set("asdfghjklASDFGHJKL")
        row3 = set('zxcvbnmZXCVBNM')
        result = []
        for word in words:
            if set(word).issubset(row1) or set(word).issubset(row2) or set(word).issubset(row3):
                result.append(word)

        return result