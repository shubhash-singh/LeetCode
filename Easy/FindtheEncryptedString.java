package Easy;

public class FindtheEncryptedString {
    public String getEncryptedString(String s, int k) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        for (int i = 0;i<n;i++){
            int index = (i+k) % n;
            result.append(s.charAt(index));
        } 
        
        return result.toString();
    }
}
