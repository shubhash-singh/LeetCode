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
        
        for (int i=0;i<str.length-1;i++){
            int value = romanValue.get(String.valueOf(str[i]));
            int nextVAlue = romanValue.get(String.valueOf(str[i+1]));
            if (value < nextVAlue){
                result += nextVAlue-value;
            }
            else{
                result += value;
            }
            
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(romanToInt(str));

    }
}
// MCMXCIV :: Input
// 1994 :: Output