package Easy;

public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] charArray = new char[s.length()];
        for(int i=0;i<s.length();i++){
            charArray[indices[i]] = s.charAt(i);
        }
        StringBuilder res = new StringBuilder();
        for(char ch : charArray){
            res.append(ch);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        System.out.println(restoreString(s, indices));
    }
}
