class Solution {
    int m,n;

    int[][] dir={{-1,0},{0,1},{1,0},{0,-1}};



    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        this.m=heights.length;
        this.n=heights[0].length;

        boolean[][] pacific=new boolean[m][n];
        boolean[][] atlantic=new boolean[m][n];

        for(int i=0;i<m;i++){
            dfs(i,0,pacific,heights);
            dfs(i,n-1,atlantic,heights);
        }

        for(int j=0;j<n;j++){
            dfs(0,j,pacific,heights);
            dfs(m-1,j,atlantic,heights);
        }

        List<List<Integer>> answer =new ArrayList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    answer.add(Arrays.asList(i,j));
                }
            }
        }
        
        return answer;
    }


   public void dfs(int r,int c,boolean[][] ocean,int[][] heights){
        
        ocean[r][c]=true;

        for(int d[]:dir){
            int nr=r+d[0];
            int nc=c+d[1];

            if(nr<0 || nr>=m || nc<0 || nc>=n) continue;

            if(!ocean[nr][nc] && heights[nr][nc]>=heights[r][c])
            dfs(nr,nc,ocean,heights);

        }

       
   }
     
}