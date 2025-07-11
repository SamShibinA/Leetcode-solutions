class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length<=1)return true;
        boolean increasing=true;
        if(nums[0]>nums[nums.length-1])increasing=false;

        for(int i=1;i<nums.length;i++){
            if(increasing){
                if(nums[i-1]>nums[i]){
                    return false;
                }
            }
            else{
                if(nums[i-1]<nums[i]){
                    return false;
                }
            }
        }

        return true;
    }
}