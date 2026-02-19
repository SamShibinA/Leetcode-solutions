class Solution {
    int m,n;
    public int[][] highestPeak(int[][] isWater) {
        this.m=isWater.length;
        this.n=isWater[0].length;

        int[][] height=new int[m][n];
        int[][] dir={{-1,0},{0,1},{1,0},{0,-1}};

        Queue<int[]> q=new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isWater[i][j]==1){
                    height[i][j]=0;
                    q.offer(new int[]{i,j});
                }
                else{
                    height[i][j]=Integer.MAX_VALUE;
                }
            }
        }

        while(!q.isEmpty()){
            int[] coordinate=q.poll();

            int row=coordinate[0];
            int col=coordinate[1];

            for(int[] d:dir){
                
                int nrow=row+d[0];
                int ncol=col+d[1];

                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n){

                    if(height[nrow][ncol]>height[row][col]+1){
                        height[nrow][ncol]=height[row][col]+1;
                        q.offer(new int[]{nrow,ncol});
                    }
                }

            }
        }

        return height;
    }

}