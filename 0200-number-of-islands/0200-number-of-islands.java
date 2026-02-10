class Solution {
    class Pair{
        int i,j;
        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    int ilen,jlen;


    public int numIslands(char[][] grid) {
        Queue<Pair> queue=new LinkedList<>();
        int count=0;
        ilen=grid.length;
        jlen=grid[0].length;

        boolean[][] visited=new boolean[ilen][jlen];

        for(int i=0;i<ilen;i++){
            for(int j=0;j<jlen;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    queue.offer(new Pair(i,j));
                    visited[i][j]=true;
                    count++;
                }

                while(!queue.isEmpty()){
                    Pair pair=queue.poll();
                    
                    int[] direction_i={-1,0,1,0};
                    int[] direction_j={0,1,0,-1};

                    for(int d=0;d<4;d++){
                        int d_i=pair.i+direction_i[d];
                        int d_j=pair.j+direction_j[d];
                        if(isValid(d_i,d_j,grid,visited)){
                            queue.offer(new Pair(d_i,d_j));
                            visited[d_i][d_j]=true;
                        }
                    }

                }
            }

        }
        return count;
    }

    public boolean isValid(int i,int j,char[][] grid,boolean[][] visited){
        return i>=0 && i<ilen && j>=0 && j<jlen && !visited[i][j] && grid[i][j]=='1';
    }
}