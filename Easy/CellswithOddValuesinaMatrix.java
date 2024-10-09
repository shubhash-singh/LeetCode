package Easy;

// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

// TODO: Optimization required
public class CellswithOddValuesinaMatrix {
    public int oddCells(int m, int n, int[][] indices) {

        int[][] ans = new int[m][n];

        for(int i = 0;i< indices.length;i++){
            int row = indices[i][0];
            int col = indices[i][1];
            int x = 0;
            int y = 0;  
            while( x < n || y < m){
                if(x < n){
                    if (ans[row][x] == 0){
                        ans[row][x] ++;
                    }
                    else{
                        ans[row][x] --;
                    }
                    x++;
                }
                if(y < m){
                    if (ans[y][col] == 0){
                        ans[y][col] ++;
                    }
                    else{
                        ans[y][col] --;
                    }
                }
                y++;
            }
        }

        int sum = 0;
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                sum += ans[i][j];
            }
        }

        return sum;
    }
}
