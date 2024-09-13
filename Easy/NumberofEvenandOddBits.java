package Easy;

// https://leetcode.com/problems/number-of-even-and-odd-bits/

public class NumberofEvenandOddBits {
    public int[] evenOddBit(int n) {
        int i = 1;
        int[] result = {0, 0};
        while(n > 0){
            if ((n & 1) == 1){ // checks whether 1st element is 1 or not
                if(i%2 == 0){
                    result[0] += 1; 
                }
                else {
                    result[1] += 1;
                }
            }
            n = n >> 1;
            i++; // right shift 1 bit for next iteration
        }
        return result;
    }
}
