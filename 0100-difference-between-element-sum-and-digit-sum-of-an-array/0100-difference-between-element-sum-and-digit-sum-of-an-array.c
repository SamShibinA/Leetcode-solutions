int differenceOfSum(int* nums, int numsSize) {
    int sum1=0;
    for(int i=0;i<numsSize;i++){
        sum1+=nums[i];
    }
    int sum2=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]>9){
            while(nums[i]!='\0'){
                int rem=nums[i]%10;
                sum2+=rem;
                nums[i]/=10;
            }
        }
        else
        sum2+=nums[i];
    }
    return sum1-sum2;
}