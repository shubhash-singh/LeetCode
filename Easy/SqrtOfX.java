package Easy;
import java.util.Scanner;

public class SqrtOfX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        System.out.println(calcSqrt(n));

    }

    private static int calcSqrt(int n ) {
        return (int)(Math.sqrt(n));
    }
}
