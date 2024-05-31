
// https://leetcode.com/problems/single-number-ii/

public class SimpleNumberII {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        
        for (int num : nums) {
            // `twos` holds the bits which appear twice
            twos |= ones & num;
            
            // `ones` holds the bits which appear once
            ones ^= num;
            
            // `threes` holds the bits which appear three times
            int threes = ones & twos;
            
            // if a bit appears three times, we reset it from `ones` and `twos`
            ones &= ~threes;
            twos &= ~threes;
        }
        
        return ones;
    }
}
