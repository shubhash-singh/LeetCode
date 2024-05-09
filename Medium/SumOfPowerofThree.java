
// https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/

// TODO:The Problem is not solved yet

public class SumOfPowerofThree {
    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(91));
    }
    public static boolean checkPowersOfThree(int n) {
        int sum = 0;
        for (int i = 0; sum + Math.pow(3, i) <= n; i++) {
            sum += Math.pow(3, i);
            if (sum == n) {
                return true;
            }
        }
        return false;
    }
    
}