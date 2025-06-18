class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] ans=new int[rows*cols][2];
        int[][] dir={{0,1},{1,0},{0,-1},{-1,0}};
        int l=1,count=0;
        int r=rStart,c=cStart;
        ans[count++]=new int[]{r,c};
        while(count<cols*rows){
            for(int d=0;d<4;d++){
                for(int i=0;i<l;i++){
                    r+=dir[d][0];
                    c+=dir[d][1];

                    if(r>=0 && r<rows && c>=0 && c<cols){
                        ans[count++]=new int[]{r,c};
                    }
                    if(count==cols*rows) return ans;
                }
                if(d==1||d==3) l++;
            }

        }
        
    return ans;
    }
}