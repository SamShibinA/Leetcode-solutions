class Solution {
    class Pair{
        int row;
        int col;
        Pair(int i,int j){
            this.row=i;
            this.col=j;
        }
    }
    public int orangesRotting(int[][] grid) {

        int m=grid.length;
        int n=grid[0].length;
        int[][] visited=new int[m][n];

        Queue<Pair> q=new LinkedList<>();

        int fresh=0;

        for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==2){
                q.offer(new Pair(i,j));
                visited[i][j]=1;
            }
            if(grid[i][j]==1)fresh++;
        }
        }

        if(fresh==0) return 0;
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};

        int number_of_minutes=-1;

        while(q.size()>0){
            int size=q.size();

            number_of_minutes++;

            for(int i=0;i<size;i++){
                int row=q.peek().row;
                int col=q.peek().col;
                q.poll();

                //checking the directions
                for(int idx=0;idx<4;idx++){
                    int nrow = row + drow[idx];
                    int ncol = col + dcol[idx];

                    if(nrow >= 0 && nrow <= m-1 && ncol >= 0 && ncol <= n-1 && visited[nrow][ncol] != 1 && grid[nrow][ncol] ==1 ){
                        q.offer(new Pair(nrow,ncol));
                        visited[nrow][ncol]=1;
                        fresh--;
                    }
                }
                
            }
        }

        return fresh==0?number_of_minutes:-1;

    }
}