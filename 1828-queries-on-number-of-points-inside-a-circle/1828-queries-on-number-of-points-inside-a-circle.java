class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n=queries.length;
        int[] result=new int[n];
        

        for(int i=0;i<n;i++){
            int x=queries[i][0];
            int y=queries[i][1];
            int r=queries[i][2];

            for(int[] point:points){
                int dx=x-point[0];
                int dy=y-point[1];

                if(dx * dx + dy * dy <= r*r )result[i]++;
            }
        }
        return result;


    }
}