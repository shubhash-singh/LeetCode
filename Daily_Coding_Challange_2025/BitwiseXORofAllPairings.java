package Daily_Coding_Challange_2025;

public class BitwiseXORofAllPairings {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int res1 = 0;
        int res2 = 0;
        if(nums1.length % 2 != 0){
            for(int x : nums2){
                res2 ^= x;
            }
        }
        if (nums2.length % 2 != 0){
            for(int x : nums1){
                res1 ^= x; 
            }
        }

        return res1 ^ res2;
    }
    public static void main(String[] args) {
        BitwiseXORofAllPairings obj = new BitwiseXORofAllPairings();
        int[] nums1 = {2,1,3};
        int[] nums2 = {10,2,5,0};
        System.out.println(obj.xorAllNums(nums1, nums2));
    }
}
