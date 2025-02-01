class Solution {
    public int countPartitions(int[] nums) {
        int fsum=0,bsum=0,c=0;
        for(int i=0;i<nums.length;i++){
            bsum+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            fsum+=nums[i];
            bsum-=nums[i];
            c+=(fsum-bsum)%2==0?1:0;
        }

        return c;

    }
}