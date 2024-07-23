package Easy;

public class Base7 {

    public static String convertToBase7(int num) {
        StringBuilder result = new StringBuilder();
        if (num == 0) {
            return "0";
        }

        boolean isNegative = num < 0;

        int n = Math.abs(num);
        while (n >0) {
            
            result.append(n % 7);
            n /= 7;
        }
        if (isNegative){
            result.append("-");
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(convertToBase7(-7));
    }
}