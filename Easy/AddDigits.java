package Easy;


// https://leetcode.com/problems/add-digits/


public class AddDigits {
    public static void main(String[] args) {
        
    }
    public int addDigits(int num) {
        if (num <=10 && num >=0){
            return num;
        }
        else{
            int sum = 0;
            while (num > 0){
                sum += num % 10;
                num = num / 10;
            }
            return addDigits(sum);
        }
    }
}

// Example 1:

// Input: num = 38
// Output: 2
// Explanation: The process is
// 38 --> 3 + 8 --> 11
// 11 --> 1 + 1 --> 2 
// Since 2 has only one digit, return it.
