class Solution {
    public int numberOfGoodSubarraySplits(int[] nums) {
        long mod=1000000007;
        long way=1;

        int pre = -1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(pre!=-1){
                    way=(way * (i-pre))%mod;
                }
                pre=i;
            }
        }
        return pre==-1?0:(int)way;
    }
}