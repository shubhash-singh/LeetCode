package Easy;

import java.util.StringTokenizer;

public class NumberofSegmentsinaString {
    public int countSegments(String s) {
        StringTokenizer tokens = new StringTokenizer(s);
        return tokens.countTokens();
    }
}
