class Solution {
    public int closedIsland(int[][] grid) {
        int count=0;

        boolean[][] visited=new boolean[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!visited[i][j]&&grid[i][j]==0&&isIsland(grid,visited,i,j))count++;
            }
        }

        return count;
        
    }


    public boolean isIsland(int[][] grid,boolean[][] visited,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length)return false;
        
        if(grid[i][j]==1||visited[i][j])return true;
        visited[i][j]=true;

        boolean top=isIsland(grid,visited,i-1,j);
        

        boolean right=isIsland(grid,visited,i,j+1);
    

        boolean bottom=isIsland(grid,visited,i+1,j);
        

        boolean left=isIsland(grid,visited,i,j-1);
        
        return top&&right&&bottom&&left;


    }
}