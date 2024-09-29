package Easy;

/**
 * NumberofBitChangestoMakeTwoIntegersEqual
 * https://leetcode.com/problems/number-of-bit-changes-to-make-two-integers-equal/
 */
public class NumberofBitChangestoMakeTwoIntegersEqual {

    public int minChanges(int n, int k) {
        int c = 0;
        for(int i=0;i<31;i++){
            int mask = (1 << i);

            int b1 = n & mask;
            int b2 = k & mask;

            if ( b2 == 0 && b1 !=0){
                n = n^mask;
                c++;
            }
        }
        return (n == k ? c: -1);
    }
}