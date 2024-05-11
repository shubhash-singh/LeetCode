# https://leetcode.com/problems/intersection-of-two-arrays/

class Solution:
    def intersection(self, nums1: list[int], nums2: list[int]) -> list[int]:
        
        return set(nums1).intersection(set(nums2))