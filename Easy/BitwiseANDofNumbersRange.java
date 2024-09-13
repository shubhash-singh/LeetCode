package Easy;

// https://leetcode.com/problems/bitwise-and-of-numbers-range/

public class BitwiseANDofNumbersRange {
    public int rangeBitwiseAnd(int left, int right) {
        int result = 0;
        while(left != right){
            left  = left >> 1;
            right = right >> 1;
            result ++;
        }
        return (left << result);
    }
}