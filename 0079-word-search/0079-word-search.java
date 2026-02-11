class Solution {

    int m,n;
    int[][] dir={{-1,0},{0,1},{1,0},{0,-1}};

    public boolean exist(char[][] board, String word) {
        this.m=board.length;
        this.n=board[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0) && isfound(board,i,j,word,"")){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean isfound(char[][] board,int i,int j,String target,String current){
        if(target.equals(current))return true;
        int idx=current.length();
        if(i<0 || i>=m || j<0 ||j>=n || board[i][j]!=target.charAt(idx))return false;

        current=current+board[i][j];
        char temp=board[i][j];
        board[i][j]='#';

        for(int d=0;d<4;d++){
            if(isfound(board,i+dir[d][0],j+dir[d][1],target,current)){
                return true;
            }
        }

        board[i][j]=temp;
        return false;

    }
}