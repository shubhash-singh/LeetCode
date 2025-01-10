package Daily_Coding_Challange_2025;

import java.util.ArrayList;
import java.util.List;

public class WordSubsets {
    public static List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreq = new int[26]; // To store the max frequency of each character in words2
        
        // Compute maximum character frequencies for words2
        for (String b : words2) {
            int[] bFreq = getCharFrequency(b);
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], bFreq[i]);
            }
        }

        List<String> universalStrings = new ArrayList<>();
        
        // Check each word in words1
        for (String a : words1) {
            int[] aFreq = getCharFrequency(a);
            boolean isUniversal = true;

            // Check if `a` satisfies the max frequency requirements
            for (int i = 0; i < 26; i++) {
                if (aFreq[i] < maxFreq[i]) {
                    isUniversal = false;
                    break;
                }
            }

            if (isUniversal) {
                universalStrings.add(a);
            }
        }

        return universalStrings;
    }

    // Helper function to calculate character frequencies
    private static int[] getCharFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }
}
