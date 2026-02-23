class Solution {

    int m,n;
    int[][] dir={{-1,0},{0,1},{1,0},{0,-1}};

    public boolean exist(char[][] board, String word) {
        this.m=board.length;
        this.n=board[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isfound(board,i,j,word,0)){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean isfound(char[][] board,int i,int j,String target,int idx){
        if(idx==target.length())return true;

        if(i<0 || i>=m || j<0 ||j>=n || board[i][j]!=target.charAt(idx))return false;

        char temp=board[i][j];
        board[i][j]='#';

        for(int d=0;d<4;d++){
            if(isfound(board,i+dir[d][0],j+dir[d][1],target,idx+1)){
                return true;
            }
        }

        board[i][j]=temp;
        return false;

    }
}