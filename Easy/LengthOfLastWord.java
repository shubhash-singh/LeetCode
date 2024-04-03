package Easy;


// https://leetcode.com/problems/length-of-last-word/description/?envType=daily-question&envId=2024-04-01

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        lengthOfLast(s);
    }
    public static int lengthOfLast(String s){
        List<String> str = new ArrayList<>();
        str = Arrays.stream(s.strip().split(" ")).toList();
        int n = str.size()-1;
        return str.get(n).strip().length();
    }
}
