package Easy;

// https://leetcode.com/problems/count-the-digits-that-divide-a-number/

class Solution {
    public int countDigits(int num) {
        int result = 0;
        char[] digits = String.valueOf(num).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            int digit = Integer.parseInt(String.valueOf(digits[i]));
            if (num % digit == 0) {
                result++;
            }
        }
        return result;
    }
}