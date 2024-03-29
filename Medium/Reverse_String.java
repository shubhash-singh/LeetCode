// https://leetcode.com/problems/reverse-integer/
// problem link

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        System.out.println(reverse(x));
        sc.close();
    }
    public static int reverse(long x) {
        String integerValue = String.valueOf(x);
        if (x < 0) {
            StringBuilder strbuild = new StringBuilder(integerValue.substring(1,(integerValue.length()))).reverse();
            if (Long.parseLong(strbuild.toString()) < Integer.MIN_VALUE) {
                return 0;
            }
            else {
                return (int)Long.parseLong("-"+strbuild.toString());
            }
        }
        StringBuilder strbuild = new StringBuilder(integerValue.substring(0,(integerValue.length()))).reverse();
        if (Long.parseLong(strbuild.toString()) > Integer.MAX_VALUE) {
            return 0;
        }
        else {
            return (int)Long.parseLong(strbuild.toString());
        }
    }
}