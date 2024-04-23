// https://leetcode.com/problems/letter-combinations-of-a-phone-number/


//TODO: Optimize the Code later

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class PhoneKeyCombination {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return Collections.emptyList();
        }
        else{
            Map<Character, String> keysCombination = Map.of(
                '1', "",
                '2', "abc",
                '3', "def",
                '4', "ghi",
                '5', "jkl",
                '6', "mno",
                '7', "pqrs",
                '8', "tuv",
                '9', "wxyz"
            );
            
            List<String> result = new ArrayList<String>();
            result.add(""); //Initial empty list
            for( char c : digits.toCharArray()){
                List<String> temp = new ArrayList<>();
                for (char letter: keysCombination.get(c).toCharArray()){ 
                    for(String str : result){
                        temp.add(str+letter);
                    }
                }
                result = temp;
            }   
            return result;
        }
        
    }
    
}