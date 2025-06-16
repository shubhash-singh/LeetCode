public class HashDividedString {
    public String stringHash(String s, int k) {
        int count = 0;
        int sum = 0;
        String res = "";
        for(char i : s.toCharArray()){
            if(count < k){
                count++;
                sum += (i - 'a');
            }
            if(count == k){
                char c = (char) ('a' + (sum % 26));
                res += String.valueOf(c);
                count = 0;
                sum = 0;
            }
        }
        return res;
    }   
    public static void main(String[] args) {
        HashDividedString obj = new HashDividedString();
        String s = "abcd";
        int k = 2;

        System.out.println(obj.stringHash(s, k));
    } 
}
