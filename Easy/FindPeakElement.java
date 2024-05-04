package Easy;


// https://leetcode.com/problems/find-peak-element/


public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        int i=0;
        for(i=1; i<nums.length-1; i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                return i;
            }
        }
        int max = nums[0];
        int maxIndex = 0;

        // Loop through the array starting from the second element.
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] > max) {
                max = nums[j]; // Update max if current element is larger.
                maxIndex = j; // Update maxIndex accordingly.
            }
        }

        return maxIndex;
        
    }
}
