class Solution {
    public int dominantIndex(int[] nums) {
        
        int m=0,mi=0;
        for(int i=0;i<nums.length;i++){
            if(m<nums[i]){
                m=nums[i];
                mi=i;
            }
        }

        for(int i:nums){
            if(i!=m && m<i*2){
               return -1;
            }
        }
        return mi;
    }
}