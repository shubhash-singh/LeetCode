package Daily_Coding_Challange_2025;

import java.util.HashMap;
import java.util.Map;

public class MinimumLengthofStringAfterOperations {

    public static int minimumLength(String s) {
        int res = 0;
        Map<Character, Integer> counter = counter(s);
        for (int x :counter.values()){
            if (x % 2 == 0) {
                res += 1;
            }
            else{
                res += 2;
            }
        }
        return res;
    }

    public static Map<Character, Integer> counter(String s) {
        // Create a HashMap to store the counts
        Map<Character, Integer> countMap = new HashMap<>();
        
        // Iterate over the string and count occurrences
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        return countMap;
    }
    public static void main(String[] args) {
        System.out.println(minimumLength("abaacbcbb")); // 5
    }
}