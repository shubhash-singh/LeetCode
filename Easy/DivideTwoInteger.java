package Easy;

import java.util.Scanner;

// https://leetcode.com/problems/divide-two-integers/
public class DivideTwoInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        sc.close();
        System.out.println(divideTwoInt(dividend, divisor));
    }
    static int divideTwoInt(int dividend, int divisor){
        long result =  (long)dividend/divisor;
        System.err.println(result);
        if (result > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        return (int)result;
    }
}