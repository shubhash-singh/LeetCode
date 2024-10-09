public class MinimumAddtoMakeParenthesesValid {
    public static int minAddToMakeValid(String s) {
        int open =0, mismatch=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='('){
                open++;
            }
            else
            {
                if(open>0)
                    open--;
                else
                    mismatch++;
            }
        } 
        return open+mismatch;   
    }
    public static void main(String[] args) {
        String s = "()))((";
        System.out.println(minAddToMakeValid(s));

    }
}
