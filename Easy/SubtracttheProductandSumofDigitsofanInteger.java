package Easy;

public class SubtracttheProductandSumofDigitsofanInteger {
    public static void main(String[] args) {
        
    }

    public int subtractProductAndSum(int n) {
        int sum = 0;
        int prod = 1;
        
        for(char c : String.valueOf(n).toCharArray()) {
            sum += c - '0';
            prod *= c - '0';
        }
        return prod - sum;
    }
}
