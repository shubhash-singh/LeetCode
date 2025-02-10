class Solution:
    def clearDigits(self, s: str) -> str:
        s_list = list(s)
        i=1
        while i < len(s_list):
            if len(s_list) == 0:
                return ""
            elif s_list[i].isdigit():
                s_list.pop(i)
                s_list.pop(i-1)
                i = 1
            else:
                i += 1
        return "".join(s_list)
    
s = "cb34"
a = Solution()
print(a.clearDigits(s))