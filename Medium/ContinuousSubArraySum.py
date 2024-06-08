# https://leetcode.com/problems/continuous-subarray-sum/solutions/

class Solution:
    def solution(self, nums:list, k:int) -> bool :

        if k == 0:
            # We need to find at least two consecutive zeroes
            for i in range(1, len(nums)):
                if nums[i] == 0 and nums[i-1] == 0:
                    return True
            return False

        prefix_sum = 0
        remainder_map = {0: -1}  # Initialize with remainder 0 at index -1 to handle edge case

        for i, num in enumerate(nums):
            prefix_sum += num
            remainder = prefix_sum % k

            if remainder in remainder_map:
                if i - remainder_map[remainder] > 1:
                    return True
            else:
                remainder_map[remainder] = i

        return False