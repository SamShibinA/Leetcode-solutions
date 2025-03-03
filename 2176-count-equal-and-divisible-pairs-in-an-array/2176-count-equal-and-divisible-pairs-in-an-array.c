int countPairs(int* nums, int numsSize, int k) {
    int c=0;

    for(int i=0;i<numsSize;i++){
        for(int j=i+1;j<numsSize;j++){
            if(nums[j]==nums[i]&&(i*j)%k==0) c++;
        }
    }

    return c;
}