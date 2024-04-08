class Solution:
    def Convert_to_title(self, columnNumbe):
        colAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        result = ""
        while(columnNumbe>0):
            columnNumbe -= 1
            num = columnNumbe%26
            result += colAlpha[num]
            columnNumbe = columnNumbe//26
            print(result)
            print(columnNumbe)
        return result[::-1]

a = Solution()
print(a.Convert_to_title(int(input())))