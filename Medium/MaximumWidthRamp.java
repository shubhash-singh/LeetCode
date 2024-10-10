/**
 * MaximumWidthRamp
 * https://leetcode.com/problems/maximum-width-ramp/description/
 */

import java.util.Stack;

public class MaximumWidthRamp {

    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();

        // First pass: Push indices of potential left boundaries into the stack
        // We only push indices where the value is smaller than the previous stack top
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                stack.push(i);
            }
        }

        int ans = 0;

        // Second pass: Iterate from right to left to find the maximum width ramp
        for (int i = n - 1; i > 0; i--) {
            // While the stack is not empty and the current element is greater than or equal to the stack top
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                // Calculate the width of the ramp and update the maximum
                ans = Math.max(ans, i - stack.peek());
                // Remove the top element as we've found a valid ramp for it
                stack.pop();
            }
        }

        // Return the maximum width ramp found
        return ans;
    }
}