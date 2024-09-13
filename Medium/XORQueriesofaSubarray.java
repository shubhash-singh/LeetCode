import java.util.Arrays;

/**
 * XORQueriesofaSubarray
 * 
 * https://leetcode.com/problems/xor-queries-of-a-subarray/
 */
public class XORQueriesofaSubarray {
    public static int[] xorQueries(int[] arr, int[][] queries) {
        // Step 1: Precompute the prefix XOR array
        int n = arr.length;
        int[] prefixXOR = new int[n + 1]; // prefixXOR[0] = 0
        
        for (int i = 0; i < n; i++) {
            prefixXOR[i + 1] = prefixXOR[i] ^ arr[i];
        }

        // Step 2: Answer each query in O(1)
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int L = queries[i][0];
            int R = queries[i][1];
            // XOR from arr[L] to arr[R] is prefixXOR[R+1] ^ prefixXOR[L]
            result[i] = prefixXOR[R + 1] ^ prefixXOR[L];
        }
        
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {16};
        int[][] queries = {{0,0},{0,0},{0,0}};

        System.out.println(Arrays.toString(xorQueries(arr, queries)));
    }
}