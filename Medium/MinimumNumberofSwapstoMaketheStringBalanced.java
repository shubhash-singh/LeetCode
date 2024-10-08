public class MinimumNumberofSwapstoMaketheStringBalanced {
    public int minSwaps(String s) {
        int count = 0;

        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '['){
                count++;
            }
            if(count > 0){
                if(s.charAt(i) == ']'){
                    count--;
                }
            }
        }
        return (count + 1)/2;
    }

    public static void main(String[] args) {
        MinimumNumberofSwapstoMaketheStringBalanced obj = new MinimumNumberofSwapstoMaketheStringBalanced();
        String str = "[]";
        System.out.println(obj.minSwaps(str));
    }
}
