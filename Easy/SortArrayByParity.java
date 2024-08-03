package Easy;

// https://leetcode.com/problems/sort-array-by-parity/

import java.util.ArrayList;
import java.util.List;

public class SortArrayByParity{
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> oddArr = new ArrayList<>();
        List<Integer> evenArr = new ArrayList<>();
        int[] resultArr = new int[nums.length];
        for(int i =0; i<nums.length;i++){
            if(nums[i] % 2 == 0){
                evenArr.add(nums[i]);
            }
            else{
                oddArr.add(nums[i]);
            }
        }
        int j =0;
        for(int i = 0; i < nums.length;i++){
            if (i < evenArr.size()){
                resultArr[i] = evenArr.get(i);

            }
            else{
                resultArr[i] = oddArr.get(j);
                j++;
            }
                
        }
        return resultArr;
    }
}