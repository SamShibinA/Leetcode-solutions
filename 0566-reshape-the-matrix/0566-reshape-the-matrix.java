class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat[0].length * mat.length != r * c) return mat;
        int[][] answer=new int[r][c];
        int i=0,j=0;

        for(int[] row:mat){
            for(int n:row){
                if(j==c){
                    i++;
                    j=0;
                }

                answer[i][j]=n;
                j++;
            }
        }

        return answer;
    }
}