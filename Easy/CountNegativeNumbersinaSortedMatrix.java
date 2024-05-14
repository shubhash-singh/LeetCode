package Easy;

// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/


public class CountNegativeNumbersinaSortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int result = 0;
        for (int[] i : grid) {
            for(int j : i) {
                if (j<0)
                    result++;
            }
        }
        return result;
    }
}
