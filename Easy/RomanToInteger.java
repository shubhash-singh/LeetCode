package Easy;

// https://leetcode.com/problems/roman-to-integer/
import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s ){
        int result = 0;
        
        HashMap<String, Integer> romanValue = new HashMap<>();
        char[] str = s.toCharArray();
        romanValue.put("I", 1); 
        romanValue.put("V", 5);
        romanValue.put("X", 10);
        romanValue.put("L", 50);
        romanValue.put("C", 100);
        romanValue.put("D", 500);
        romanValue.put("M", 1000);
        int i = 0;
        while(i<str.length-1){
            System.out.println("i : " + i);
            int value = romanValue.get(String.valueOf(str[i]));
            System.out.println("Value: " + value);
            int nextVAlue = romanValue.get(String.valueOf(str[i+1]));
            System.out.println("nextValue : " + nextVAlue);

            if (value < nextVAlue){
                result += nextVAlue-value;
                i += 2;
            }
            else{
                result += value;
                i++;
            }
            
            System.out.println("Result : " + result);

            
        }
        if (i == str.length-1){
            result += romanValue.get(String.valueOf(str[i]));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        sc.close();
        System.out.println(romanToInt(str));

    }
}
// MCMXCIV :: Input
// 1994 :: Output