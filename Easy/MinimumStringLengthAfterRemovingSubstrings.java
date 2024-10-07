package Easy;

/**
 * https://leetcode.com/problems/minimum-string-length-after-removing-substrings/
 * MinimumStringLengthAfterRemovingSubstrings
 */
public class MinimumStringLengthAfterRemovingSubstrings {

    public int minLength(String s) {
        StringBuilder str = new StringBuilder(s);

        boolean found = true;

        while (found) {
            found = false;
            
            int index = str.indexOf("AB");
            if (index != -1) {
                str.delete(index, index + 2);
                found = true;
            }
            index = str.indexOf("CD");
            if (index != -1) {
                str.delete(index, index + 2);
                found = true;
            }
            
        }
        return str.length();
    }
    public static void main(String[] args) {
        MinimumStringLengthAfterRemovingSubstrings obj = new MinimumStringLengthAfterRemovingSubstrings();
        String s = "ABFCACDB";
        System.out.println(obj.minLength(s));
    }
}