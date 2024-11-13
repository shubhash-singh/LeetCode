// https://leetcode.com/problems/count-the-number-of-fair-pairs/

import java.util.Arrays;

public class CounttheNumberofFairPairs {

    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);  // Sort the array for efficient two-pointer traversal
        long res = 0;

        for (int i = 0; i < nums.length; i++) {
            res += countPairsWithSumInRange(nums, i + 1, lower - nums[i], upper - nums[i]);
        }

        return res;
    }

    private static long countPairsWithSumInRange(int[] nums, int start, int low, int high) {
        int left = start, right = nums.length - 1;

        // Find the first element >= low
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= low) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        int lowIndex = left;

        // Reset right pointer and find the last element <= high
        left = start;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= high) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        int highIndex = right;

        return Math.max(0, highIndex - lowIndex + 1);
    }

    public static void main(String[] args) {
        int[] nums = {0,1,7,4,4,5}; 
        int lower = 3, upper = 6;

        System.out.println(countFairPairs(nums, lower, upper));
    }
}