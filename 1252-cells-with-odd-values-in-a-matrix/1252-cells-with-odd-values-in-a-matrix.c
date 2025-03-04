int oddCells(int m, int n, int** indices, int indicesSize, int* indicesColSize) {
    int rc[m];
    int cc[n];
    int c=0;
    for(int i=0;i<m;i++) rc[i]=0;
    for(int i=0;i<n;i++) cc[i]=0;
    for(int i=0;i<indicesSize;i++){
        rc[indices[i][0]]++;
        cc[indices[i][1]]++;
    }


    for(int i=0;i<m;i++) for(int j=0;j<n;j++) if((rc[i]+cc[j])%2==1) c++;

    return c;
}