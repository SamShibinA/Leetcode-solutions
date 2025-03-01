int duplicateNumbersXOR(int* nums, int numsSize) {
    int result = 0;
    int fre[51]={0};
    for (int i = 0; i < numsSize; i++) {
        fre[nums[i]]++;
    }
    for(int i=0;i<=50;i++){
        if(fre[i]==2){
            result^=i;
        }
    }
    return result;
}