class Solution {
    int m,n;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        this.m=image.length;
        this.n=image[0].length;

        dfs(image,sr,sc,image[sr][sc],color);

        return image;

    }

    public void dfs(int[][] image,int r,int c,int target,int change){
        if(r<0||r>=m||c<0||c>=n||image[r][c]!=target || target==change)return;

        image[r][c]=change;

        dfs(image,r-1,c,target,change);
        dfs(image,r,c+1,target,change);
        dfs(image,r+1,c,target,change);
        dfs(image,r,c-1,target,change);
    }
}