# https://leetcode.com/problems/find-lucky-integer-in-an-array/

class Solution:
    def findLucky(self, arr: list[int]) -> int:
        lucky_number = -1 

        for i in arr:
            if i == arr.count(i):
                if lucky_number <= i:
                    lucky_number = i

        return lucky_number