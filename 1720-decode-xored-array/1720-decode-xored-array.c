/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* decode(int* encoded, int encodedSize, int first, int* returnSize) {
    int* ans=(int*)malloc(sizeof(int)*(encodedSize+1));
    *returnSize=encodedSize+1;
    ans[0]=first;
    for(int i=1;i<encodedSize+1;i++){
        ans[i]=ans[i-1]^encoded[i-1];
    }
    return ans;
}