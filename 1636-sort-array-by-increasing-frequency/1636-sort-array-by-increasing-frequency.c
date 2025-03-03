/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int *fre,min;
int compare(const void* a, const void* b, int* fre, int min);
int compareWrapper(const void* a,const void* b){
        return compare(a,b,fre,min);
    }

int* frequencySort(int* nums, int numsSize, int* returnSize) {
   

    int max=nums[0];
    min=nums[0];
    for(int i=0;i<numsSize;i++){
        max=max>nums[i]?max:nums[i];
        min=min<nums[i]?min:nums[i];
    }
    int s=max-min+1;
   fre=(int*)malloc(sizeof(int)*s);
    for(int i=0;i<s;i++) fre[i]=0;

    for(int i=0;i<numsSize;i++){
        fre[nums[i]-min]+=1;
    }

    qsort(nums,numsSize,sizeof(int),compareWrapper);
    *returnSize=numsSize;
    return nums;
}

int compare(const void* a,const void* b,int* fre,int min){
        int* n1=(int*)a;
        int* n2=(int*)b; 
        int f1=fre[*n1-min];
        int f2=fre[*n2-min];
        if(f1!=f2) return f1-f2;
        else return *n2-*n1;
    }