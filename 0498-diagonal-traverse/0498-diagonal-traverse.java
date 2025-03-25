class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        int c=m*n;
        int[] ans=new int[c];
        int i=0,j=0,idx=0;
        boolean t=false,ch=false;
        while(c>0){
            ch=false;
            if(i>=0 && i<m && j>=0 && j<n){
                ans[idx++]=mat[i][j];
                c--;
            }
            else{

                if(i<0){
                    i+=1;
                    t=true;
                }
                if(i>=m){
                    i-=1;
                }

                if(j<0){
                    j+=1;
                    t=false;
                }
                if(j>=n){
                    j-=1;
                }
                ch=true;
            }
            if(!ch){

            if(t){
                i+=1;
                j-=1;
            }
            else{
                i-=1;
                j+=1;
            }
            }
            if(i>=m){
                i=m-1;
                j+=2;
                t=false;

            } 
            if(j>=n){
                j=n-1;
                i+=2;
                t=true;

            } 

        }
        return ans;
    }
}