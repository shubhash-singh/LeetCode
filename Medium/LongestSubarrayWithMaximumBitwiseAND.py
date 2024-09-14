
# https://leetcode.com/problems/longest-subarray-with-maximum-bitwise-and/

class LongestSubarrayWithMaximumBitwiseAND:
    def longestSubarray(self, nums: list[int]) -> int:
        max_num = max(nums)
        count = 0
        max_count = 0
        for i in nums:
            if i == max_num:
                count += 1
            else:
                max_count = max(max_count, count)
                count = 0
        max_count = max(max_count, count)
        if max_count == 0:
            return 1
        return max_count