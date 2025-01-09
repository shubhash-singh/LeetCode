class CountingWordsWithaGivenPrefix:
    def prefixCount(self, words: list[str], pref: str) -> int:
        count = 0
        n = len(pref)
        for word in words:
            
            if len(word) >= n and word[:n] == pref:
                count += 1
        return count
    