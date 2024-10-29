package Easy;

// https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/

/**
 * DivisibleandNondivisibleSumsDifference
 */
public class DivisibleandNondivisibleSumsDifference {

    public int differenceOfSums(int n, int m) {
        int divisibleSum = 0;
        int nonDivisibleSum = 0;   

        for (int i = 0; i <= n; i++) {
            if(i%m == 0){
                divisibleSum += i;
            }
            else{
                nonDivisibleSum += i;
            }
        }
        return nonDivisibleSum - divisibleSum;
    }
}