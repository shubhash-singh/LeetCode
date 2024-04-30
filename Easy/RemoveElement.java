package Easy;

// https://leetcode.com/problems/remove-element/description/


class RemoveElement{
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        for (int i:arr) {
            System.out.println(i);
        }
    }
    // public static int removeElement(int[] nums, int val) {
    //     int replaceVal = Integer.MAX_VALUE;
    //     for (int i=0;i<nums.length;i++) {
    //         if (nums[i] == val){
    //             nums[i] = replaceVal;
    //         }
    //     }

    // }
}