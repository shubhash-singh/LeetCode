package Easy;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        System.out.println(ConvertToInteger(str));
    }

    private static int ConvertToInteger (String str ) {
        try {
            double result = Long.parseLong(str.strip().split(" ")[0]);
            System.out.println(result);
            if(result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            else if(result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            else return (int)result;


        } catch (Exception e) {
        }
        return 0;
    }
}