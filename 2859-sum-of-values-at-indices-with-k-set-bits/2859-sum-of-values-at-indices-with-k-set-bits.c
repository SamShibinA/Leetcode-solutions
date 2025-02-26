int sumIndicesWithKSetBits(int* nums, int numsSize, int k){
 int sum=0;
 for(int i=0;i<numsSize;i++){
    int temp=i,s=0;
    while(temp>0){
        s=s+temp%2;
        temp/=2;
    }
    if(s==k){
        sum+=nums[i];
    }
 }
 return sum;
}