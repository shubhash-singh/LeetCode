package Easy;

// https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (nums[start] >= target){
            return 0;
        }
        else if (nums[end] < target){
            return nums.length;
        }
        else if (nums[end] == target){
            return nums.length-1;
        }
        while(start <= end) {
            int mid = start  + (end-start) / 2;
            if (target == nums[mid]){
                return mid;
            }
            
            else if (nums[mid] < target && nums[mid+1] > target) {
                return mid+1;
            }
            else if (nums[mid] < target) {
                start = mid;
            }
            else if (nums[mid] > target) {
                end = mid;
            }
        }
        return -1;
    }
}
