package Easy;

import java.util.Arrays;

// https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/

public class MakeTwoArraysEqual {
    public boolean canBeEqual(int[] target, int[] arr) {
        if( target.length != arr.length){
            return false;
        }
        else{
            Arrays.sort(target);
            Arrays.sort(arr);
            return Arrays.equals(target, arr);
        }
    }
}
