class Solution {
    List<List<Integer>> answer;
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int[][] board=new int[8][8];

        for(int[] Q:queens){
            board[Q[0]][Q[1]]=1;
        }

        answer=new ArrayList<>();
        
        dfs(king[0],king[1],-1,0,board);
        dfs(king[0],king[1],-1,1,board);
        dfs(king[0],king[1],0,1,board);
        dfs(king[0],king[1],1,1,board);
        dfs(king[0],king[1],1,0,board);
        dfs(king[0],king[1],1,-1,board);
        dfs(king[0],king[1],0,-1,board);
        dfs(king[0],king[1],-1,-1,board);

        return answer;
    }


    public void dfs(int i,int j,int di,int dj,int[][] board){
        if(i < 0 || i > 7 || j < 0 || j > 7)return;

        if(board[i][j]==1){
            answer.add(Arrays.asList(i,j));
            return;
        }

        dfs(i+di,j+dj,di,dj,board);
    }
}