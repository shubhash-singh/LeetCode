package Easy;

/**
 * HarshadNumber
 */
public class HarshadNumber {

    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int temp = x;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }

        if(temp % sum == 0){
            return sum;
        }
        return -1;
    }

    public static void main(String[] args) {
        HarshadNumber hn = new HarshadNumber();
        System.out.println(hn.sumOfTheDigitsOfHarshadNumber(18));
    }
}