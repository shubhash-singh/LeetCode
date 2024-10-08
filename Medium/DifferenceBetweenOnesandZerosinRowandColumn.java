public class DifferenceBetweenOnesandZerosinRowandColumn {
    public int[][] onesMinusZeros(int[][] grid) {
        int nRow = grid.length;
        int nCol = grid[0].length;
        int[] rowDif = new int[nRow];
        int[] colDif = new int[nCol];

        for(int i = 0;i<nRow;i++){
            for(int j = 0;j<nCol;j++){
                if(grid[i][j] == 1){
                    rowDif[i]++;
                    colDif[j]++;
                }
                else{
                    rowDif[i]--;
                    colDif[j]--;
                }
            }
        }
        for(int i = 0;i<nRow;i++){
            for(int j = 0;j<nCol;j++){
                grid[i][j] = rowDif[i] + colDif[j];
            }
        }
        return grid;
    }
    
}
