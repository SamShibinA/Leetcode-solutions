class Solution {
    public boolean canJump(int[] nums) {
        int end=0;
        int farthest=0;

        for(int i=0;i<nums.length-1;i++){
            farthest=Math.max(farthest,i+nums[i]);

            if(i==end){
                end=farthest;
            }
        }

        return end>=nums.length-1;
    }
}