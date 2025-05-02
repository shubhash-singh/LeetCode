public class LongestCommonSubSequence {
    public static void main(String[] args) {
        String text1 = "abcde", text2 = "ace" ;
        System.out.println(longestCommonSubsequence(text1, text2));
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] DP = new int[text1.length() + 1][text2.length() + 1];
        
        for(int row = 1; row <= text1.length(); row++){
            for(int col = 1; col <= text2.length(); col++){
                if(text1.charAt(row-1) == text2.charAt(col-1)){
                    DP[row][col] = DP[row-1][col-1] + 1;
                }else{
                    DP[row][col] = Math.max(DP[row-1][col], DP[row][col-1]);
                }
            }
        }
        return DP[text1.length()][text2.length()];
    }
}
