// https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/

public class FindKthBitinNthBinaryString {
    public char findKthBit(int n, int k) {
        return findKthBitHelper(n, k);
    }

    private char findKthBitHelper(int n, int k) {
        // Base case: If n is 1, the string is "0", so the only bit is '0'
        if (n == 1) {
            return '0';
        }
        
        // Calculate the length of the string Sn
        int length = (1 << n) - 1;  // Length of Sn is 2^n - 1
        int middle = length / 2 + 1; // Middle element position
        
        // If k is the middle element, it is always '1'
        if (k == middle) {
            return '1';
        }
        // If k is before the middle, it's the same as in S(n-1)
        else if (k < middle) {
            return findKthBitHelper(n - 1, k);
        }
        // If k is after the middle, it's the inverted and reversed bit from S(n-1)
        else {
            int mirroredIndex = middle - (k - middle);  // Find the mirrored index in the first half
            char mirroredBit = findKthBitHelper(n - 1, mirroredIndex);
            // Invert the mirrored bit ('0' -> '1', '1' -> '0')
            return mirroredBit == '0' ? '1' : '0';
        }
    }
}
