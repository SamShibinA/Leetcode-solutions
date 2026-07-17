class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;


        for(int i=n-1;i>0;i--){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(i+j<n && j<n)
                l.add(grid[j][i+j]);
            }

            Collections.sort(l);

            int idx=0;

            for(int j=0;j<n;j++){
                if(i+j<n && j<n)
                grid[j][i+j]=l.get(idx++);
            }


        }


        for(int i=0;i<n;i++){

            List<Integer> l=new ArrayList<>();

            for(int j=0;j<n;j++){
                if(i+j<n)
                l.add(grid[i+j][j]);
            }

            Collections.sort(l,Collections.reverseOrder());

            int idx=0;
            for(int j=0;i+j<n;j++){
                grid[i+j][j]=l.get(idx++);
            }
        }
        

        return grid;
    }
}