int deleteGreatestValue(int** grid, int gridSize, int* gridColSize) {
    int compare(const void* a, const void* b) {
    return *(int*)a - *(int*)b;
    }

    int sum=0,m=0;

    for(int i=0;i<gridSize;i++){
        qsort(grid[i],gridColSize[i],sizeof(int),compare);
    }

    for(int i=0;i<gridColSize[0];i++){
        for(int j=0;j<gridSize;j++){
            m=fmax(m,grid[j][i]);
        }
        sum+=m;
    }
     return sum;
}