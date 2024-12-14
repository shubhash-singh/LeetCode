package Easy;

public class CalculateMoneyinLeetcodeBank {

    public int totalMoney(int n) {
        int res = 0;
        int index = 0;
        for (int i = 0; i < n/7; i++) {
            res += 1 + index;
            res += 2 + index;
            res += 3 + index;
            res += 4 + index;
            res += 5 + index;
            res += 6 + index;
            res += 7 + index;
            index ++;
        }

        int remainingIter = n % 7;
        for (int i = 1; i <= remainingIter; i++) {
            res += index + i;
        }
        return res;
    }
}