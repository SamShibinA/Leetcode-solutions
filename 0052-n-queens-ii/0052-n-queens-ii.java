class Solution {
    int answer;
    boolean[] col;
    boolean[] diag1;
    boolean[] diag2;

    public int totalNQueens(int n) {
        answer=0;
        col= new boolean[n];
        diag1= new boolean[n * 2];
        diag2= new boolean[n * 2];

        traverse(0,n);

        return  answer;

    }

    public void traverse(int row,int n){
        if(row==n){
            answer++;
            return;
        }

        for(int c=0;c<n;c++){
            if(col[c]||diag1[row-c+n]||diag2[row+c])continue;

            col[c]=true;
            diag1[row-c+n]=true;
            diag2[row+c]=true;

            traverse(row+1,n);

            col[c]=false;
            diag1[row-c+n]=false;
            diag2[row+c]=false;
        }
    }
}