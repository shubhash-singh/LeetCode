package Easy;

import java.util.Scanner;

public class Valid_Perfect_Square{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPerfectSquare(num));
        sc.close();
    }
    public static boolean isPerfectSquare(int num) {
        double squareNum = Math.sqrt(num);
        if(squareNum == Math.floor(squareNum)){
            return true;
        }
        return false;
    }
    public void test(){
        StringBuilder result = new StringBuilder();
        result.
    }
}