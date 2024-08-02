// https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together-ii/

public class MinimumSwap {
    public static int minSwaps(int[] nums) {
        int totalOnes = 0;
        for (int num : nums) {
            if (num == 1) {
                totalOnes++;
            }
        }

        if (totalOnes == 0) {
            return 0;
        }

        int n = nums.length;
        int[] doubledNums = new int[2 * n];
        System.arraycopy(nums, 0, doubledNums, 0, n);
        System.arraycopy(nums, 0, doubledNums, n, n);

        // Initialize the count of 1's in the first window of size totalOnes
        int currentOnes = 0;
        for (int i = 0; i < totalOnes; i++) {
            if (doubledNums[i] == 1) {
                currentOnes++;
            }
        }
        
        int maxOnes = currentOnes;

        // Slide the window across the doubled array
        for (int i = 1; i <= n; i++) {
            if (doubledNums[i - 1] == 1) {
                currentOnes--;
            }
            if (doubledNums[i + totalOnes - 1] == 1) {
                currentOnes++;
            }
            maxOnes = Math.max(maxOnes, currentOnes);
        }

        // The minimum number of swaps required
        return totalOnes - maxOnes;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 1, 1, 0, 0};
        System.out.println(minSwaps(nums1)); // Output: 1

        int[] nums2 = {0, 1, 1, 1, 0, 0, 1, 1, 0};
        System.out.println(minSwaps(nums2)); // Output: 2

        int[] nums3 = {1, 1, 0, 0, 1};
        System.out.println(minSwaps(nums3)); // Output: 0
    }
}
