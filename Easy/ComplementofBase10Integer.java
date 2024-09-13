package Easy;

public class ComplementofBase10Integer {
    public int bitwiseComplement(int n) {
        // gets the length of the bits
        int bitLen = Integer.toBinaryString(n).length();
        // create a mask containing binary number of 1 followed by "bitLen" zeros
        int mask = (1 << bitLen) - 1;
        // return the n XOR bitLen which will flip all bits 
        return n ^ mask;
    }
}
