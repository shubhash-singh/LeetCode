class Solution:
    # https://leetcode.com/problems/find-the-difference-of-two-arrays/
    def findDifference(self, nums1: list[int], nums2: list[int]) -> list[list[int]]:
        return [list(set(nums1)-set(nums2)), list(set(nums2)-set(nums1))]
        