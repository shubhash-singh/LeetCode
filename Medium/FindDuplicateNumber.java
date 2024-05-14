import java.util.HashSet;


// https://leetcode.com/problems/find-the-duplicate-number/


public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return nums[0];
    }
}
