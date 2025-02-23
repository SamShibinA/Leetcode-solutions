int subsetXORSum(int* nums, int numsSize) {
    
    int Xor(idx,tot){
        if(idx==numsSize) return tot;
        return Xor(idx+1,tot^nums[idx]) + Xor(idx+1,tot);
    }
    return Xor(0,0);
}