package LeetCode_75;

public class RemovingStarsFromaString {

    public String removeStars(String s) {
        StringBuilder res = new StringBuilder(s);
        // int index = 0;
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)=='*'){
                res.deleteCharAt(i);
                i--;
                res.deleteCharAt(i);
                i--;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "erase*****";

        RemovingStarsFromaString obj = new RemovingStarsFromaString();
        System.out.println(obj.removeStars(s));
    }
}