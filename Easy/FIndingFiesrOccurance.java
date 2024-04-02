package Easy;

import java.util.Scanner;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/\


public class FIndingFiesrOccurance {
    
    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length() || haystack.length()<0){
            return -1;
        }
        else{
            return haystack.indexOf(needle);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hayStack = sc.nextLine();
        String needle = sc.nextLine();
        sc.close();
        System.out.println(strStr(hayStack, needle));
    }
}
