/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* sortByBits(int* arr, int arrSize, int* returnSize) {
    int cd(int num){
        int c=0;
        while(num!=0){
            num&=(num-1);
            c++;}
        return c;
    }
    *returnSize=arrSize;

    int compare(const void* a,const void* b){
        int ca=cd(*(int*)a),cb=cd(*(int*)b);
        if(ca!=cb) return ca-cb;
        else return *(int*)a-*(int*)b;
    }

    qsort(arr,arrSize,sizeof(int),compare);

    return arr;
    
}