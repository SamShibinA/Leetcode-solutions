class Solution {
    int m,n;
    int[][] dir={{-1,0},{0,1},{1,0},{0,-1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        this.m=heights.length;
        this.n=heights[0].length;

        boolean[][] pacific=new boolean[m][n];
        boolean[][] atlantic=new boolean[m][n];

        for(int i=0;i<m;i++){
            dfs(pacific,heights,i,0);
            dfs(atlantic,heights,i,n-1);
        }

        for(int i=0;i<n;i++){
            dfs(pacific,heights,0,i);
            dfs(atlantic,heights,m-1,i);
        }

        List<List<Integer>> ans=new ArrayList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pacific[i][j]&&atlantic[i][j]){
                    ans.add(Arrays.asList(i,j));
                }
            }
        }

        return ans;

    }

    public void dfs(boolean[][] ocean,int[][] heights,int r,int c){
        if(ocean[r][c])return;
        ocean[r][c]=true;

        for(int[] d:dir){
            int nr=r+d[0];
            int nc=c+d[1];

            if(nr<0||nr>=m||nc<0||nc>=n) continue;

            if(heights[r][c]<=heights[nr][nc]){
                dfs(ocean,heights,nr,nc);
            }
        }

    }
}