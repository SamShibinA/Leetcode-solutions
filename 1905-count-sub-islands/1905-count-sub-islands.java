class Solution {
    int height,width;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        this.height=grid2.length;
        this.width=grid2[0].length;

        boolean[][] visited=new boolean[height][width];
        int count=0;

        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                if(grid2[i][j]==1&&!visited[i][j]&&isSub(grid1,grid2,visited,i,j)){
                    count++;
                }
            }
        }

        return count;
    }


    public boolean isSub(int[][] grid1,int[][] grid2,boolean[][] visited,int i,int j){
        if(i<0||j<0||i>=height||j>=width||grid2[i][j]==0||visited[i][j])return true;
        if(grid1[i][j]!=grid2[i][j])return false;

        visited[i][j]=true;

        boolean top=isSub(grid1,grid2,visited,i-1,j);
        boolean right=isSub(grid1,grid2,visited,i,j+1);
        boolean bottom=isSub(grid1,grid2,visited,i+1,j);
        boolean left=isSub(grid1,grid2,visited,i,j-1);

        return top&&right&&bottom&&left;

    }
    
}