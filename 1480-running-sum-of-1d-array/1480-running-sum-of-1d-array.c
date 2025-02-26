

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* runningSum(int* nums, int numsSize, int* returnSize){
  int sum=0;
  *returnSize=numsSize;
  int *ans=(int*)malloc(sizeof(int)*numsSize);
  for(int i=0;i<numsSize;i++){
    sum+=nums[i];
    ans[i]=sum;
}
return ans;
}