package Easy;

public class CountPrefixesofaGivenString {

    public static void main(String[] args) {
        String[] words = {"a","b","c","ab","bc","abc"};
        String s = "abc";

        System.out.println(countPrefixes(words, s));

    }
    public static int countPrefixes(String[] words, String s) {
        int count = 0;

        for(String pref : words){
            // if(pref.length() <= s.length() && s.substring(0, pref.length()).equals(pref)){
            //     count++;
            // }
            if(s.startsWith(pref))
                count++;
        }

        return count;
    }
}
