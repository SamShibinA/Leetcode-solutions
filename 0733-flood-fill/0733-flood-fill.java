class Solution {
    int[][] image;
    boolean[][] visited;
    int row_size,col_size;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        this.image=image;
        this.row_size=image.length;
        this.col_size=image[0].length;
        this.visited=new boolean[row_size][col_size];
        if(isValid(sr,sc,image[sr][sc])) dfs(sr,sc,color,image[sr][sc]);

        return image;

    }

    public void dfs(int i ,int j,int color,int target){
        image[i][j]=color;
        visited[i][j]=true;

        int[] dir_i={-1,0,1,0};
        int[] dir_j={0,1,0,-1};

        for(int d=0;d<4;d++){
            int new_i=i+dir_i[d];
            int new_j=j+dir_j[d];
            if(isValid(new_i,new_j,target)) dfs(new_i,new_j,color,target);
        }


    }

    public boolean isValid(int i,int j,int target){
        return i>=0 && i<row_size && j>=0 && j<col_size && !visited[i][j] && image[i][j]==target; 
    }
}