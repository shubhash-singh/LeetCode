package Easy;
// 
// TODO not solved yet
public class IntersectionOfTwoArrayII {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        System.out.println(intersect(arr1, arr2));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] common =  intersect(nums1, nums2);
        // to get common element of two array
        return common;
    }
}