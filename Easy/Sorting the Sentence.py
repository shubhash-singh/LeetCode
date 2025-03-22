class Solution:
    def sortSentence(self, s: str) -> str:
        s_list = s.split(" ")
        s_list.sort(key=lambda x: x[-1])

        res = ""
        for i in s:
            res += i[:-1] + " "
        return res.strip()
        




# Input: s = "is2 sentence4 This1 a3"
# Output: "This is a sentence"