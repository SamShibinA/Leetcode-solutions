bool canAliceWin(int* nums, int numsSize) {
    int ss=0,ds=0;
    for(int i=0;i< numsSize;i++){
        if(nums[i]<=9) ss+=nums[i];
        else ds+=nums[i];
    }
    return ds!=ss;
}