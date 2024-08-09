// https://leetcode.com/problems/find-missing-and-repeated-values/

package Easy;

import java.util.HashSet;

public class FindMissingAndRepeatedValues {


    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
        int[] res = new int[2];
        int n = grid.length;
        int[] result = new int[n * n];
        int j = 0;
        for (int[] row : grid) {
            for (int value : row) {
                result[j++] = value;
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (set.contains(result[i])) {
                res[0] = result[i];
            } else {
                set.add(result[i]);
            }
        }
        for (int i = 1; i <=result.length; i++) {
            if (!set.contains(i)) {
                res[1] = i;
                break;
            }
        }
        return res;
    }
}
