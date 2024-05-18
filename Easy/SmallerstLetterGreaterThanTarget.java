package Easy;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallerstLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char i : letters){
            if (i>target){
                return i;
            }
        }
        return letters[0];
    }
}
