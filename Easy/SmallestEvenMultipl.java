package Easy;

// https://leetcode.com/problems/smallest-even-multiple/

public class SmallestEvenMultipl {
    public static int smallestEvenMultiple(int n) {
        if(n % 2 != 0){
            return n*2;
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(4));
    }
}
