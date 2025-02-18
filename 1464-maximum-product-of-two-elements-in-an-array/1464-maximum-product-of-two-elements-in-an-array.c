int maxProduct(int* nums, int numsSize) {
    int max=0;
    for(int i=0;i<numsSize;i++){
        for(int j=i+1;j<numsSize;j++){
            int t=(nums[i]-1)*(nums[j]-1);
            max=fmax(max,t);
        }
    }
    return max;
}