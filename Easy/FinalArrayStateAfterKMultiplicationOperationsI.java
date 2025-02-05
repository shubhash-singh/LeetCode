package Easy;

public class FinalArrayStateAfterKMultiplicationOperationsI {

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k-- > 0){
            int index = findMinimun(nums);
            nums[index] *= multiplier;
        }
        return nums;
    }
    private int findMinimun(int[] arr){
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        // Step 2: Find the first occurrence of min element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                return i;
            }
        }
        return -1;
    }
}