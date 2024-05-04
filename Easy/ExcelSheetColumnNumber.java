package Easy;


// https://leetcode.com/problems/excel-sheet-column-number/
public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String str = "AA";
        System.out.println(titleToNumber(str));

    }
    public static int titleToNumber(String columnTitle) {
        int result = 1;
        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return result;
    }
}
