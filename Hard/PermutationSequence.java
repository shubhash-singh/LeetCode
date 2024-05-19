import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/permutation-sequence/

public class PermutationSequence {

    public String getPermutation(int n, int k) {
    k -= 1; // to get the make it 0 bases index
    
    // Create a list of numbers from 1 to n
    List<Integer> numbers = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
        numbers.add(i);
    }
    
    // Initialize the result permutation
    StringBuilder permutation = new StringBuilder();
    
    // Compute the permutation using factorials
    for (int i = n; i > 0; i--) {
        int fact = factorial(i - 1);
        int index = k / fact;
        permutation.append(numbers.remove(index));
        k %= fact;
    }
    
    return permutation.toString();
}

    // Helper method to compute factorial
    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}