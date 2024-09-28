# https://leetcode.com/problems/convert-date-to-binary/

class Solution:
    def convertDateToBinary(self, date: str) -> str:
        strList = list(map(int, date.split('-')))
        result = []

        for word in strList:
            result.append(bin(word)[2:])
        
        return '-'.join(result)

    
a = Solution()
a.convertDateToBinary("2080-02-29")