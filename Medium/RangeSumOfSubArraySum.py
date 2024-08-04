class Solution:
    def rangeSum(self,nums, n, left, right):
        MOD = 10**9 + 7
        
        # Step 1: Generate all subarray sums
        subarray_sums = []
        for i in range(n):
            current_sum = 0
            for j in range(i, n):
                current_sum += nums[j]
                subarray_sums.append(current_sum)
        
        # Step 2: Sort the subarray sums
        subarray_sums.sort()
        
        # Step 3: Calculate the sum from index left to right (1-based index)
        result = sum(subarray_sums[left-1:right]) % MOD
        
        return result
