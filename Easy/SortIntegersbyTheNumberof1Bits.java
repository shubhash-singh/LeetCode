package Easy;
/*
 * https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
 */
import java.util.Arrays;

public class SortIntegersbyTheNumberof1Bits {
    public static void main(String[] args) {
        int[] arr = {3, 7, 8, 6, 5};
        int[] sortedArr = sortByBits(arr);

        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] sortByBits(int[] arr) {
        Integer[] arrInteger = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        // Use Arrays.sort with a custom comparator
        Arrays.sort(arrInteger, (a, b) -> {
            int countA = Integer.bitCount(a); // Count of 1's in binary representation of a
            int countB = Integer.bitCount(b); // Count of 1's in binary representation of b

            // First, compare by the count of 1's
            if (countA != countB) {
                return countA - countB;
            } else {
                // If they have the same number of 1's, compare by the value of the integers
                return a - b;
            }
        });

        return Arrays.stream(arrInteger).mapToInt(Integer::intValue).toArray();
    }
}
