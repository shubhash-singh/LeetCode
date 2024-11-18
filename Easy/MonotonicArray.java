package Easy;

public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return true;
        }
    
        boolean ascending = true;
        boolean descending = true;
    
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                descending = false;
            } else if (nums[i] < nums[i - 1]) {
                ascending = false;
            }
    
            if (!ascending && !descending) {
                return false;
            }
        }
    
        return true;
        
    }
}
