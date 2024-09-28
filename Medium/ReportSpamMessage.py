# https://leetcode.com/problems/report-spam-message/

class Solution:
    def reportSpam(self, message: list[str], bannedWords: list[str]) -> bool:
        bannedWords = set(bannedWords)
        spamCount = 0
        for i in message:
            if i in bannedWords:
                spamCount += 1
            if spamCount == 2:
                return True

        return False 