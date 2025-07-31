class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int row=matrix.length,col=matrix[0].length;
        List<Integer>answer=new ArrayList<>();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(isLucky(i,j,row,col,matrix)){
                    answer.add(matrix[i][j]);
                }
            }
        }
        return answer;
    }

    public boolean isLucky(int row,int col,int rowsize,int colsize,int[][] matrix){
        for(int i=0;i<colsize;i++){
            if(matrix[row][i]<matrix[row][col])return false;
        }

        for(int i=0;i<rowsize;i++){
            if(matrix[i][col]>matrix[row][col])return false;
        }
        return true;
    }
}