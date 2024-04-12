package Easy;

import java.util.Scanner;

// # https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        System.out.println(palindrome(str));
    }

    public static boolean palindrome(String str){
        StringBuilder result = new StringBuilder();
        int i = str.length();
        while(i-->0){
            if (Character.isLetterOrDigit(str.charAt(i))){
                result.append(str.charAt(i));
            }
        }
        System.err.println(result);
        if (result.toString().toLowerCase().equals(result.reverse().toString().toLowerCase())){
            return true;
        }
        return false;
    }
}
// A man, a plan, a canal: Panama