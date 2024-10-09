public class MinimumAddtoMakeParenthesesValid {
    public static int minAddToMakeValid(String s) {
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
        return count;
    }
    public static void main(String[] args) {
        String s = "()))((";
        System.out.println(minAddToMakeValid(s));
    }
}
