# https://leetcode.com/problems/uncommon-words-from-two-sentences/

from collections import Counter


class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> list[str]:
        sent1 = list(s1.split(" "))
        sent2 = list(s2.split(" "))
        sent = sent1 + sent2

        words = Counter(sent)
        uncommon_word = []
        for word in words:
            if words[word] == 1:
                uncommon_word.append(word)
        return uncommon_word