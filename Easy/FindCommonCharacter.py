# https://leetcode.com/problems/find-common-characters/

class Solution:
    def commonChars(self, words: list[str]) -> list[str]:
        if not words:
            return []

        # Initialize frequency dictionary with the first word
        freq = {char: words[0].count(char) for char in words[0]}

        # Iterate over the rest of the words and update the frequency dictionary
        for word in words[1:]:
            current_freq = {char: word.count(char) for char in word}
            for char in freq.keys():
                if char in current_freq:
                    freq[char] = min(freq[char], current_freq[char])
                else:
                    freq[char] = 0

        # Collect the characters that appear in all words
        result = []
        for char, count in freq.items():
            result.extend([char] * count)
        
        return result