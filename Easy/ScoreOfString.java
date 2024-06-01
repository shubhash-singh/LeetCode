package Easy;

/**
 * https://leetcode.com/problems/score-of-a-string/
 */

public class ScoreOfString {
    public static void main(String[] args) {
        String  s = "hello";
        System.out.println(scoreOfString(s));
    }

    public static int scoreOfString(String s) {
        int result = 0;
        for (int i =0;i<s.length()-1;i++){
            result += Math.abs((int)s.charAt(i) - (int)s.charAt(i+1));
        }
        return result;
    }
}