class Solution {
    public int maxSum(int[][] grid) {
        int[][] dir={{0,0},{0,1},{0,2},{1,1},{2,0},{2,1},{2,2}};
        int m=grid.length;
        int n=grid[0].length;

        int max=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int sum=0;
                if(m-i+1>=3 && n-j+1>=3){
                for(int[] d:dir){
                    int di=i+d[0];
                    int dj=j+d[1];

                    if(di < m && dj < n){
                        sum+=grid[di][dj];
                    }
                    else{
                        sum=0;
                        break;
                    }
                }
                max=Math.max(max,sum);
                }
                else{
                    break;
                }
            }
        }
        return max;
    }
}