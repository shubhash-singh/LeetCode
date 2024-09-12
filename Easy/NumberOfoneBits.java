package Easy;

// https://leetcode.com/problems/number-of-1-bits/


public class NumberOfoneBits {
    public int hammingWeight(int n) {
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
