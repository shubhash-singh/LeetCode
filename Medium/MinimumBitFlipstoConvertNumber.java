// https://leetcode.com/problems/minimum-bit-flips-to-convert-number/

public class MinimumBitFlipstoConvertNumber {
    public int minBitFlips(int start, int goal) {
        int count = 0;
        int bitDifference = start ^ goal;
        while(bitDifference > 0){
            if ((bitDifference & 1) != 0){ // checks whether 1st element is 1 or not
                count ++;
            }
            bitDifference = bitDifference >> 1; // right shift 1 bit for next iteration
        }
        return count;
    }
}
