class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;

        k=k%(n*m);
        for(int i=0;i<k;i++){
            shift(grid,n,m);
        }

        List<List<Integer>> ans=new ArrayList<>();

        for(int i=0;i<n;i++){

            ans.add(new ArrayList<>());

            for(int j=0;j<m;j++){
                ans.get(i).add(grid[i][j]);
            }
        }

        return ans;
    }


    public void shift(int[][] grid,int n,int m){
        int t=grid[n-1][m-1];

        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            int temp = grid[i][j];
            grid[i][j]=t;
            t=temp;
        }

        }
    }
}