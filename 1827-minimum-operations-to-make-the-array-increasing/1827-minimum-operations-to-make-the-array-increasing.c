

int minOperations(int* nums, int numsSize){
 int n=numsSize;
 if(n==1) return 0;

 int ans=0;

 for(int i=1;i<n;i++){
    while(nums[i]<=nums[i-1]) {
        nums[i]+=1;
        ans+=1;
 }
}
return ans;
}