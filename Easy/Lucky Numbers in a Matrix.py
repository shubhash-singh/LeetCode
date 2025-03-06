class Solution:
    def luckyNumbers(self, matrix: list[list[int]]) -> list[int]:
        res = []
        
        for i in range(len(matrix)):
            min_row = min(matrix[i])
           
            for j in range(len(matrix[i])):
                col = []
                for row in matrix:
                    col.append(row[j])
                if min_row == max(col):
                    res.append(min_row)
        return res
    
matrix = [[3,7,8],
          [9,11,13],
          [15,16,17]]
a = Solution()
print(a.luckyNumbers(matrix))