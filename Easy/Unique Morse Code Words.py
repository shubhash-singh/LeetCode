class Solution:
    def uniqueMorseRepresentations(self, words: list[str]) -> int:
        morse_code = {'a':".-",
                      'b':"-...",
                      'c':"-.-.",
                      'd':"-..",
                      'e':".",
                      'f':"..-.",
                      'g':"--.",
                      'h':"....",
                      'i':"..",
                      'j':".---",
                      'k':"-.-",
                      'l':".-..",
                      'm':"--",
                      'n':"-.",
                      'o':"---",
                      'p':".--.",
                      'q':"--.-",
                      'r':".-.",
                      's':"...",
                      't':"-",
                      'u':"..-",
                      'v':"...-",
                      'w':".--",
                      'x':"-..-",
                      'y':"-.--",
                      'z':"--.."}
        res = []
        for word in words:
            morse_word = ""
            for ch in word:
                morse_word += morse_code[ch]
            if len(morse_word) > 0:
                res.append(morse_word)
        return len(set(res))