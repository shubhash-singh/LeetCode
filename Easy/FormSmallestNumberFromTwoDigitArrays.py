class Solution:
    def minNumber(self, nums1: List[int], nums2: List[int]) -> int:

        common = set(nums1) & set(nums2)
        if common:
            return min(common)
        else:

            val1 = min(nums1)
            val2 = min(nums2)

            return min(val1, val2)*10 + max(val1, val2)
                