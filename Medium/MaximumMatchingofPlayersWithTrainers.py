#  https://leetcode.com/problems/maximum-matching-of-players-with-trainers/description/

class Solution(object):
    def matchPlayersAndTrainers(self, players, trainers):
        players = sorted(players)
        trainers = sorted(trainers)
        minVal = min(len(players), len(trainers))
        j = len(trainers) - 1
        i = minVal - 1
        result = 0
        # print('Trainers: ', trainers)
        # print('Players: ', players)
        while (i >= 0):
            # print('i: ', i)
            # print('j: ', j)
            # print('player[i]: ', players[i])
            # print('trainers[j]: ', trainers[j])
            if (players[i] <= trainers[j]):
                result += 1
                j -= 1
                i -= 1
            else:
                i -= 1
            # print('result: ', result)
        return result


a = [2, 1]
b = [2, 1, 2, 2, 3, 3, 2, 4, 1, 1, 4, 1, 3, 3, 4, 1, 3, 2, 3, 2, 2, 3, 1, 2, 4]
obj = Solution()
print(obj.matchPlayersAndTrainers(a, b))
