class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m= grid.length;
        int n=grid[0].length;

        int[] row=new int[m];
        int[] col=new int[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    row[i]++;
                    col[j]++;
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=(row[i] - (n-row[i])) + (col[j] - (m-col[j]));
            }
        }

        return grid;
    }
}