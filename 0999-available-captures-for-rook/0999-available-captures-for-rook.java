class Solution {
    public int numRookCaptures(char[][] board) {
        int x=0,y=0;

        boolean flag=true;
        for(int i=0;i<8 && flag;i++)for(int j=0;j<8;j++){
            if(board[i][j]=='R'){
                x=i;
                y=j;
                flag=false;
                break;
            }        
        }

        int i=x;
        int ans=0;
        while(i>=0){
            if(board[i][y]=='p'){
                ans++;
                break;
            }

            if(board[i][y]=='B'){
                break;
            }

            i--;
        }

        i=x;
        while(i<8){
            if(board[i][y]=='p'){
                ans++;
                break;
            }

            if(board[i][y]=='B'){
                break;
            }

            i++;
        }

        i=y;

        while(i>=0){
            if(board[x][i]=='p'){
                ans++;
                break;
            }

            if(board[x][i]=='B'){
                break;
            }

            i--;
        }

        i=y;

        while(i<8){
            if(board[x][i]=='p'){
                ans++;
                break;
            }

            if(board[x][i]=='B'){
                break;
            }

            i++;
        }

        return ans;
    }
}