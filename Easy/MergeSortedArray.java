package Easy;

import java.util.Arrays;
import java.util.Scanner;

// https://leetcode.com/problems/merge-sorted-array
public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums1 = new int[sc.nextInt()];
        int m = sc.nextInt();
        int[] nums2 = new int[sc.nextInt()];
        int n = sc.nextInt();
        sc.close();
        merge(nums1, m, nums2, n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i : nums2) {
            nums1[m] = i;
            m++;
        }
        Arrays.sort(nums1);
    }
}
