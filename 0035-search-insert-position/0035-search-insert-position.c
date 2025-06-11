int searchInsert(int* nums, int numsSize, int target) {
   int result=0;
   for(int i=0;i<numsSize;i++){
    if(nums[i]>=target){
        result=i;
        break;
    }
   }
   if(nums[numsSize-1]<target){
    result=numsSize;
   }
   return result;
}