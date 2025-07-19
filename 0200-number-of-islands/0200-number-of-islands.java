class Solution {
    int width,height;
    public int numIslands(char[][] grid) {
        this.height=grid.length;
        this.width=grid[0].length;

        int count=0;
        boolean[][] visited=new boolean[height][width];

        for(int i=0;i<height;i++){
        for(int j=0;j<width;j++)
        {
            if(grid[i][j]=='1' && findArea(grid,visited,i,j)>0){
                count++;
            }
        }
        }

        return count;
    }

    public int findArea(char[][] grid,boolean[][] visited,int i,int j){
        if(i<0||j<0||i>=height||j>=width|| grid[i][j]=='0'||visited[i][j])return 0;

        int sum=1;
        visited[i][j]=true;

        sum+=findArea(grid,visited,i-1,j);
        sum+=findArea(grid,visited,i,j+1);
        sum+=findArea(grid,visited,i+1,j);
        sum+=findArea(grid,visited,i,j-1);

        return sum;

    }
}