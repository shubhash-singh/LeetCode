package Easy;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = Long.parseLong(sc.next());
        sc.close();
        System.out.println(isPalindromeNumber(num));
    }

    private static boolean isPalindromeNumber(long num) {
        if(num<0){
            return false;
        } else {
            StringBuilder str = new StringBuilder(String.valueOf(num)).reverse();
            long revNum = Long.parseLong(str.toString());
            if(num == revNum) {
                return true;
            }
            return false;
        }
    }
}
