// https://leetcode.com/problems/sum-of-digits-of-string-after-convert/

package Easy;

/**
 * SumofDigitsofStringAfterConvert
 */
public class SumofDigitsofStringAfterConvert {

    public static void main(String[] args) {
        
    }

    static int getLucky(String s, int k){
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            sb.append(String.valueOf((int)c - 96));
        }
        
        String sum = sb.toString();
        for(int i=0;i<k;i++){
            sum = calculateSumOfDigits(sum);
        }
        return Integer.parseInt(sum);
    }
    public static String calculateSumOfDigits(String number) {
        int sum = 0;
        
        for (int i = 0; i < number.length(); i++) {
            char digitChar = number.charAt(i);
            if (Character.isDigit(digitChar)) {
                sum += Character.getNumericValue(digitChar);
            }
        }
        
        return String.valueOf(sum);
    }
}