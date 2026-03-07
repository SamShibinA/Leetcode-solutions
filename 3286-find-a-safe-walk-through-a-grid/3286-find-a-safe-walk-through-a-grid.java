class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m=grid.size();
        int n=grid.get(0).size();

        int[][] dist=new int[m][n];

        for(int[] row:dist){
            Arrays.fill(row,Integer.MAX_VALUE);
        }

        dist[0][0]=grid.get(0).get(0);

        ArrayDeque<int[]>list=new ArrayDeque<>();

        list.addFirst(new int[]{0,0});

        int[][] dir={{-1,0},{0,1},{1,0},{0,-1}};

        while(!list.isEmpty()){
            int[] temp=list.pollFirst();

            int r=temp[0];
            int c=temp[1];

            for(int[] d:dir){
                int nr=r+d[0];
                int nc=c+d[1];


                if(nc<0 || nr<0 || nc >= n || nr >=m) continue;

                int cost=grid.get(nr).get(nc);

                if(dist[r][c] + cost < dist[nr][nc]){
                    dist[nr][nc]=dist[r][c]+cost;

                    if(cost==1){
                        list.addLast(new int[]{nr,nc});
                    }
                    else{
                        list.addFirst(new int[]{nr,nc});
                    }
                }
            }
        }

        return dist[m-1][n-1] < health;
    }
}