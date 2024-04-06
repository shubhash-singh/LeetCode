package Easy;
// https://leetcode.com/problems/squares-of-a-sorted-array/
import java.util.Arrays;

public class SquareOfSortedArray {
    public static int[] sortedSquare(int[] arr){
        int[] result = new int[arr.length];
        int i=0;
        while(i++<=arr.length) {
            result[i] = arr[i]*arr[i]; 
        }
        Arrays.sort(result);
        return result;
    }
}
