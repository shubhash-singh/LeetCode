# TODO: problem not accepted by leetcode due to time limitation

class Solution:
    def vowelStrings(self, words: list[str], queries: list[list[int]]) -> list[int]:
        res = []
        for query in queries:
            start = query[0]
            end = query[1] + 1
            count = 0
            for i in range(start, end):
                if self.startWithVowelAndEndWithVowel(words[i]):
                    count += 1
            
            res.append(count)
        return res
    
    def startWithVowelAndEndWithVowel(self, word:str) -> bool:
        vowels = {'a', 'e', 'i', 'o', 'u'}
        return word[0] in vowels and word[-1] in vowels