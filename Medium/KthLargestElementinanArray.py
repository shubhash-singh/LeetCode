# https://leetcode.com/problems/kth-largest-element-in-an-array/

class KthLargestElementinanArray:
    def findKthLargest(self, nums: list[int], k: int) -> int:
        nums.sort()
        return nums[-k]

