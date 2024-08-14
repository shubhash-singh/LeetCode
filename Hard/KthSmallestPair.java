// https://leetcode.com/problems/find-k-th-smallest-pair-distance/

import java.util.Arrays;

public class KthSmallestPair {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = nums[nums.length - 1] - nums[0];
        
        while (left < right) {
            int mid = (left + right) / 2;
            int count = 0, j = 0;
            
            for (int i = 0; i < nums.length; i++) {
                while (j < nums.length && nums[j] - nums[i] <= mid) j++;
                count += j - i - 1;
            }
            
            if (count >= k) right = mid;
            else left = mid + 1;
        }
        
        return left;
    }
}