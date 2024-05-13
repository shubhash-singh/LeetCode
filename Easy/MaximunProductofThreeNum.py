# https://leetcode.com/problems/maximum-product-of-three-numbers/

class Solution:
    def maximumProduct(self, nums: list[int]) -> int:
        nums.sort()

        max_product = nums[-1] * nums[-2] * nums[-3]

        if nums[0] < 0 and nums[1] < 0:
            possible_max_product = nums[0] * nums[1] * nums[-1]

            max_product = max(max_product, possible_max_product)
        
        return max_product