class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;

        int result=0;

        int[] row=new int[n];
        int[] col=new int[n];

        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                max=Math.max(max,grid[i][j]);
            }
            row[i]=max;

            max=Integer.MIN_VALUE;

            for(int j=0;j<n;j++){
                max=Math.max(max,grid[j][i]);
            }
            col[i]=max;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                result+=Math.min(row[i],col[j])-grid[i][j];
            }
        }

        return result;
    }
}