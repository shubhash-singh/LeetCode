package Easy;

/**
 * ReversePrefixofWord
 * https://leetcode.com/problems/reverse-prefix-of-word/
 */
public class ReversePrefixofWord {
    public static String reversePrefix(String word, char ch) {

        int index = word.indexOf(ch);
        if(index != -1){
            StringBuilder res1 = new StringBuilder(word.substring(0, index+1)).reverse();
            String res2 = word.substring(index+1, word.length());

            return res1.toString() + res2;

        }
        else{
            return word;
        }
    }
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }
    
}