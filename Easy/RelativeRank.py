class Solution:
    def findRelativeRanks(self, score: list[int]) -> list[str]:
        result = score.copy()  # Create a copy of the score list
        
        result.sort(reverse=True)  # Sort the result list in descending order
        
        ranks = []  # Create an empty list to store the relative ranks
        
        ranks.append("Gold Medal")
        ranks.append("Silver Medal")
        ranks.append("Bronze Medal")
        
        for i in range(3, len(result)):
            ranks.append(str(result[i]))
        
        for i in range(len(score)):
            rank = ranks[result.index(score[i])]
            score[i] = rank  # Assign the relative rank to the corresponding score in the score list
        
        return score

a = Solution()
print(a.findRelativeRanks([10,3,8,9,4]))
            
                