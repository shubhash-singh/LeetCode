
# https://leetcode.com/problems/median-of-two-sorted-arrays/

import statistics

class Solution:
    def findMedianSortedArrays(self, nums1: list[int], nums2: list[int]) -> float:
        nums1 += nums2
        return statistics.median(nums1)
        