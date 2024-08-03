package Easy;

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

public class SamllerNumberCount {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] count = new int[101];
        for (int i = 0; i < n; i++){
            count[nums[i]]++;
        }
        int sum = 0;
        for (int i = 0; i < 101; i++){
            sum += count[i];
            count[i] = sum;
        }
        for (int i = 0; i < n; i++){
            if (nums[i] != 0){
                nums[i] = count[nums[i] - 1];
            }
        }
        return nums;
    }
    
}
