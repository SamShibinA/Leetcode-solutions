/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findThePrefixCommonArray(int* A, int ASize, int* B, int BSize, int* returnSize) {
    int *ans=(int*)malloc(sizeof(int)*ASize);

    
    for(int i=0;i<ASize;i++){
        int c=0;
        for(int j=0;j<=i;j++){
            for(int k=0;k<=i;k++){
                if(A[j]==B[k]){
                    c+=1;
                    break;
                }
            }
        }
        ans[i]=c;
    }
    *returnSize=ASize;
    return ans;
}