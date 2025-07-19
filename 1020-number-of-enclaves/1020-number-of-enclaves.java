class Solution {
    int height,width;
    public int numEnclaves(int[][] grid) {
        this.height=grid.length;
        this.width=grid[0].length;
        

        boolean[][] visited=new boolean[height][width];
        int count=0;

        for(int i=0;i<height;i++){
            if(!visited[i][0])dfs(grid,visited,i,0);
            if(!visited[i][width-1])dfs(grid,visited,i,width-1);
        }

        for(int j=0;j<width;j++){
            if(!visited[0][j])dfs(grid,visited,0,j);
            if(!visited[height-1][j])dfs(grid,visited,height-1,j);
        }

        for(int  i=0;i<height;i++){
            for(int j=0;j<width;j++){
                if(grid[i][j]==1)count++;
            }
        }
    return count;

    }


    public void dfs(int[][] grid,boolean[][] visited,int i,int j){
        if(i<0||j<0||i>=height||j>=width||visited[i][j]||grid[i][j]==0)return;
        visited[i][j]=true;
        grid[i][j]=0;
        dfs(grid,visited,i-1,j);
        dfs(grid,visited,i,j+1);
        dfs(grid,visited,i+1,j);
        dfs(grid,visited,i,j-1);
    }
}