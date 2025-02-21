int diagonalSum(int** mat, int matSize, int* matColSize) {
    int ans=0;

    for(int i=0;i<matSize;i++){
        for(int j=0;j<matColSize[i];j++){
            if(i==j||j==matColSize[i]-1-i){
                ans+=mat[i][j];
            }
        }
    }
    return ans;
}