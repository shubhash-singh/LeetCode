public class LargestNumberAfterMutatingSubstring {
    public String maximumNumber(String num, int[] change) {

        char[] arr = num.toCharArray();
        boolean subStringFlag = false;
        for(int i =0;i<arr.length;i++){
            int digit = arr[i] - '0'; 
            
            
            if (change[digit] > digit) {
                arr[i] = (char) (change[digit] + '0');
                subStringFlag = true;
            }
            else if (digit > change[digit] && subStringFlag){
                break;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        LargestNumberAfterMutatingSubstring obj = new LargestNumberAfterMutatingSubstring();
        
        String num = "132";
        int[] change = {9,8,5,0,3,6,4,2,6,8};
// Output: "832"

        System.out.println(obj.maximumNumber(num, change));
    }
}