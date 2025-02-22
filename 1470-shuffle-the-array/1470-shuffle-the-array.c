

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* shuffle(int* nums, int numsSize, int n, int* returnSize){
 int* ans=(int*)malloc(sizeof(int)*numsSize);
 *returnSize=numsSize;
 int index=0;
 for(int i=0;i<n;i++){
    ans[index++]=nums[i];
    ans[index++]=nums[n+i];
 }

 return ans;
 
}
