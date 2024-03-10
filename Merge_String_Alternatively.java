package Easy;

import java.util.Scanner;


public class Merge_String_Alternatively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        StringBuilder result = new StringBuilder();
        if (word1.length() <= word2.length())
        {
            for (int i=0;i<word1.length();i++)
            {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
            }
            for (int j=word1.length();j<word2.length();j++)
                result.append(word2.charAt(j));
        }
        else
        {
            for (int i=0;i<word2.length();i++)
            {
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
            }
            for (int j=word2.length();j<word1.length();j++)
                result.append(word1.charAt(j));
        }
        
        
        System.out.println(result.toString());
        sc.close();
    }
}