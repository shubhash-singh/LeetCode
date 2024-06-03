package Easy;

/**
 * https://leetcode.com/problems/fibonacci-number/
 */
public class FibonacciNumber {

    public int fib(int n) {
        int fth = 0;
        int f1 = 1;
        int f0 = 0;
        if (n <=0)  return 0;
        if (n == 1) return 1;
        while(n-->1){
            fth = f1 + f0;
            f0 = f1;
            f1 = fth;
        }
        return fth;
    }
}