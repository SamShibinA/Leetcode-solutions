class Solution {
    boolean[] col;
    boolean[] diag1;
    boolean[] diag2;
    List<List<String>> answer;

    public List<List<String>> solveNQueens(int n) {
        col=new boolean[n];
        diag1=new boolean[2*n];
        diag2=new boolean[2*n];

        char[][] board=new char[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }

        answer=new ArrayList<>();

        traverse(board,0,n);

        return answer;

    }


    public void traverse(char[][] board,int row,int n){
        if(row==board.length){
            constructboard(board);
            return;
        }

        for(int c=0;c<n;c++){
            if(col[c] || diag1[row-c+n] || diag2[row+c])continue;

            board[row][c]='Q';

            col[c]=true;
            diag1[row-c+n]=true;
            diag2[row+c]=true;

            traverse(board,row+1,n);

            board[row][c]='.';

            col[c]=false;
            diag1[row-c+n]=false;
            diag2[row+c]=false;

        }


    }


    public void constructboard(char[][] board){
        List<String> temp= new ArrayList<>();

        int n=board.length;

        for(int i=0;i<n;i++){
            temp.add(new String(board[i]));
        }

        answer.add(new ArrayList<>(temp));
    }
}

