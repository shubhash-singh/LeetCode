package Daily_Coding_Challange_2025;

public class CountServersthatCommunicate {

    public int countServers(int[][] grid) {
        int res = 0;
        
        int[] rowSum = new int[grid.length];
        int[] colSum = new int[grid[0].length];

        for (int i = 0; i < rowSum.length; i++) {
            for (int j = 0; j < colSum.length; j++) {
                rowSum[i] += grid[i][j];
                colSum[j] += grid[i][j];
            }
        }

        for (int i = 0; i < rowSum.length; i++) {
            for (int j = 0; j < colSum.length; j++) {
                if (grid[i][j] == 1 && (rowSum[i] > 1 || colSum[j] > 1)) {
                    res ++;
                }
            }
        }


        return res;
    }
}