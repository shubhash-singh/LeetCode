import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/


public class FirstAndLastIndexOfElementInSirtedArray {
    public static int[] elementRange(int[] nums, int target){
        int[] result = {-1, -1};
        List<Integer> array = new ArrayList<Integer>();
        array = IntStream.of(nums) // Create an IntStream from the array
        .boxed()  // Box primitive `int` to `Integer`
        .collect(Collectors.toList());

        if (array.size() == 0) return result;
        else {
            result[0] = array.indexOf(target);
            result[1] = array.lastIndexOf(target);
        }
        return result;
    }
}
