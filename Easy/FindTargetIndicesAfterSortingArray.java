package Easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-target-indices-after-sorting-array/

public class FindTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        int lowerElement = 0;
        int elemCount = 0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] < target){
                lowerElement ++;
            }
            if(nums[i] == target){
                elemCount++;
            }
        }
        for(int i = 0;i<=elemCount;i++){
            res.add(lowerElement+1);
        }

        return res;

    }
}
