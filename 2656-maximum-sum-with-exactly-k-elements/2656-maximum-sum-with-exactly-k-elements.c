int maximizeSum(int* nums, int numsSize, int k){
   int max=nums[0];
   for(int i=0;i<numsSize;i++){
    max=fmax(max,nums[i]);
   }
   int res=0;
   for(int i=1;i<=k;i++){
    res+=max;
    max++;
   }
   return res;
}