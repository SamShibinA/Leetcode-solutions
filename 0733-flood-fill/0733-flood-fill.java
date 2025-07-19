class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image,sr,sc,image[sr][sc],color);
        return image;
    }

    public void dfs(int[][] image,int i,int j,int target,int color){
        if(i<0||j<0||i>=image.length||j>=image[0].length||image[i][j]==color||image[i][j]!=target)return;
        image[i][j]=color;

        dfs(image,i-1,j,target,color);
        dfs(image,i,j+1,target,color);
        dfs(image,i+1,j,target,color);
        dfs(image,i,j-1,target,color);
    }
}