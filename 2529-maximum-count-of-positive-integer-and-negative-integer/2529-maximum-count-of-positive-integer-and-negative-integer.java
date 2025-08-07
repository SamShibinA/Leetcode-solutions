class Solution {
    public int maximumCount(int[] nums) {
      int i;
      int zc=0;
      for(i=0;i<nums.length;i++){
        if(nums[i]==0)zc++;
        if(nums[i]>0)break;
      }

      return i-zc>nums.length-i?i-zc:nums.length-i;

    }
}