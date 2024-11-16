package LeetCode_75;

// https://leetcode.com/problems/merge-strings-alternately/

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        while(i < word1.length() && i < word2.length()){
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
            i++;
        }

        while(i<word1.length()){
            res.append(word1.charAt(i++));
        }
        while(i<word2.length()){
            res.append(word2.charAt(i++));
        }

        return res.toString();
    }
}

// class Solution:
//     def mergeAlternately(self, word1: str, word2: str) -> str:
//         result = ""
//         if len(word1) < len(word2):
//             n = len(word1)
//             for i in range(n):
//                 result += word1[i]
//                 result += word2[i]
//             for i in range(n,len(word2)):
//                 result += word2[i]
//         else:
//             n = len(word2)
//             for i in range(n):
//                 result += word1[i]
//                 result += word2[i]
//             for i in range(n,len(word1)):
//                 result += word1[i]
        
        
//         return result