class Solution:
    def countPrefixSuffixPairs(self, words: list[str]) -> int:
        def isPrefixAndSuffix(str1, str2):
            return str2.startswith(str1) and str2.endswith(str1)

        n = len(words)
        count = 0

        for i in range(n):
            for j in range(i + 1, n):
                if isPrefixAndSuffix(words[i], words[j]):
                    count += 1

        return count