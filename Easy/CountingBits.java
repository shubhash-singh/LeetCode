package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class CountingBits {
    public static int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i=0;i<n;i++){
            int count = 0;
            while(i > 0){
                if((i & 1) != 0){
                    count++;
                }
                i = i >> 1;
            }
            result[i] = count;
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arrays.toString(countBits(n)));
        sc.close();
    }
}