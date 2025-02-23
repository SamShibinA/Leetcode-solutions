/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* leftRightDifference(int* nums, int numsSize, int* returnSize){
int *ans=nums;
*returnSize=numsSize;
int n=numsSize;
int left[n],right[n];
left[0]=0;
right[n-1]=0;
for(int i=1;i<n;i++){
    left[i]=left[i-1]+nums[i-1];
}
for(int i=n-2;i>=0;i--){
    right[i]=right[i+1]+nums[i+1];
}
for(int i=0;i<numsSize;i++){
    ans[i]=abs(left[i]-right[i]);
}
return ans;
}