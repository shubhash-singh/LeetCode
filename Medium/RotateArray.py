# https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150

class Solution:    
    def rotate(self, nums: list[int], k: int) -> None:
        for i in range(k):
            elem = nums.pop(-1)
            nums.insert(0, elem)
        