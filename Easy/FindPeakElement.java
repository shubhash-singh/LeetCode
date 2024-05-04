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
        if (nums.length ==2){
            if (nums[0]>nums[1]) return 0;
            else return 1;
        }
        return 0;
        
    }
}
