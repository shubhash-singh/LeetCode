package Easy;

import java.util.Arrays;


//  https://leetcode.com/problems/running-sum-of-1d-array/

public class RunningSumof1dArray {

    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            res[i] = sum;
        }

        return res;
        
    }

    public static void main(String[] args) {
        RunningSumof1dArray rs = new RunningSumof1dArray();
        int[] arr = {1,1,1,1,1};
        System.out.println(Arrays.toString(rs.runningSum(arr)));
    }
}