class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> list=new ArrayList<>();

        int m=matrix.length,n=matrix[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    list.add(new int[]{i,j});
                }
            }
        }

        for(int[] cod:list){
            for(int i=0;i<n;i++){
                matrix[cod[0]][i]=0;
            }

            for(int i=0;i<m;i++){
                matrix[i][cod[1]]=0;
            }
        }

    }
}