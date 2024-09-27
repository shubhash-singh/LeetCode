package Easy;

// https://leetcode.com/problems/reverse-bits/

public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        // n = Math.abs(n);
        return Integer.reverse(n);
    }
}
