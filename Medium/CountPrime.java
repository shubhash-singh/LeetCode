
// https://leetcode.com/problems/count-primes/

// TODO: Not solved
public class CountPrime {
    public static void main(String[] args) {
        int n = 1000;
        System.out.println(countprimes(n));
    }
    public static int countprimes(int n) {
    
        int result = 0;
        for(int i =2;i<n;i++){
            if(isprime(i)) result++;
        }
        return result;
    }
    public static boolean isprime(int n){
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        int i = 5;
        while (i * i <= n)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
            i+=6;
        return true;
    }
}