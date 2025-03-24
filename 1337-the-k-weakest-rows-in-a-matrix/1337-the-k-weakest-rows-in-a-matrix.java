class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int r=mat.length,c=mat[0].length;
        int [][] ans=new int[r][2];
        for(int i=0;i<r;i++){
            int co=0;
        for (int j=0;j<c;j++){
            if(mat[i][j]==1) {
                co++;
            }
        }
            ans[i][0]=i;
            ans[i][1]=co; 
        }

        Arrays.sort(ans,(a,b) -> Integer.compare(a[1],b[1]));

        int[] fans=new int[k];

        for(int i=0;i<k;i++){
            fans[i]=ans[i][0];
        }

        return fans;

    }
}