/**
 * SingleElementInSortedArray
 */
public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid % 2 == 1) {
                mid--;
            }

            if (arr[mid] != arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 2;
            }
        }

        return arr[end];
    }
}
